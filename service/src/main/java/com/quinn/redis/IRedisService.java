package com.quinn.redis;

import com.quinn.keygenerate.KeyGenerate;
import com.quinn.keygenerate.KeyGenerateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author Quinn
 * @date 2018/2/6
 * @package com.qiaorong.common
 */
public abstract class IRedisService<T> {

    @Autowired
    protected RedisTemplate<String, Object> redisTemplate;
    @Resource
    protected HashOperations<String, String, T> hashOperations;

    /**
     * 存入redis中的key
     *
     * @return
     */
    protected abstract String getRedisKey();

    /**
     * 初始化系统
     */
    protected abstract void init();

    /**
     * 添加
     *
     * @param key    key
     * @param doamin 对象
     * @param expire 过期时间(单位:秒),传入 -1 时表示不设置过期时间
     */
    public void put(String key, T doamin, long expire) {
        hashOperations.put(getRedisKey(), key, doamin);
        if (expire != -1) {
            redisTemplate.expire(getRedisKey(), expire, TimeUnit.SECONDS);
        }
    }

    /**
     * 封装和jedis方法
     * 可用于分布式锁
     *
     * @param key
     * @param value
     * @return
     */
    public boolean setNX(final String key, final String value) {
        return redisTemplate.opsForValue().setIfAbsent(key, value);
    }

    /**
     * 获取自增id
     *
     * @param em
     * @return
     */
    public long getKey(KeyGenerateEnum em) {
        int diff = 10000;
        String d = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        long seq = hashOperations.increment(KeyGenerate.keys + d, em.name(), 1l);
        redisTemplate.expire(KeyGenerate.keys + d, 1, TimeUnit.SECONDS);
        long id = Long.parseLong(d + (diff + seq));
        return id - diff;
    }

    /**
     * 获取自增id
     * expire 过期时间（秒），当过期时间小于1秒时持久化到redis
     * key 存储地址，可以为null
     * @param em
     * @return
     */
    public long getKey(KeyGenerateEnum em, String key, long expire) {
        long seq = hashOperations.increment(KeyGenerate.keys, em.name() + key, 1l);
        if (expire > 0) {
            redisTemplate.expire(KeyGenerate.keys, expire, TimeUnit.SECONDS);
        }
        return seq;
    }


    /**
     * 删除
     *
     * @param key 传入key的名称
     */
    public void remove(String key) {
        hashOperations.delete(getRedisKey(), key);
    }

    /**
     * 查询
     *
     * @param key 查询的key
     * @return
     */
    public T get(String key) {
        return hashOperations.get(getRedisKey(), key);
    }

    /**
     * 获取当前redis库下所有对象
     *
     * @return
     */
    public List<T> getAll() {
        return hashOperations.values(getRedisKey());
    }

    /**
     * 查询查询当前redis库下所有key
     *
     * @return
     */
    public Set<String> getKeys() {
        return hashOperations.keys(getRedisKey());
    }

    /**
     * 判断key是否存在redis中
     *
     * @param key 传入key的名称
     * @return
     */
    public boolean isKeyExists(String key) {
        return hashOperations.hasKey(getRedisKey(), key);
    }

    /**
     * 查询当前key下缓存数量
     *
     * @return
     */
    public long count() {
        return hashOperations.size(getRedisKey());
    }


}
