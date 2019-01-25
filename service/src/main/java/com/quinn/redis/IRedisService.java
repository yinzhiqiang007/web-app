package com.quinn.redis;

import com.quinn.app.common.util.CommonUtils;
import com.quinn.keygenerate.KeyGenerate;
import com.quinn.keygenerate.KeyGenerateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
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

    @Resource
    protected ValueOperations<String, String> valueOperations;

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
     * @param value  对象
     * @param expire 过期时间(单位:秒),传入 -1 时表示不设置过期时间
     */
    public void put(String key, T value, long expire) {
        hashOperations.put(getRedisKey(), key, value);
        if (expire != -1) {
            redisTemplate.expire(getRedisKey(), expire, TimeUnit.SECONDS);
        }
    }

    /**
     * 添加map
     *
     * @param key    key
     * @param value  对象
     * @param expire 过期时间(单位:秒),传入 -1 时表示不设置过期时间
     */
    public void putAll(String key, Map<String, T> value, long expire) {
        hashOperations.putAll(key, value);
        if (expire != -1) {
            redisTemplate.expire(getRedisKey(), expire, TimeUnit.SECONDS);
        }
    }

    /**
     * 添加
     *
     * @param key    key
     * @param value  对象
     * @param expire 过期时间(单位:秒),传入 -1 时表示不设置过期时间
     */
    public void setStr(String key, String value, long expire) {
        if (expire <= 0) {
            valueOperations.set(key, value);
        } else {
            valueOperations.set(key, value, expire, TimeUnit.SECONDS);
        }
    }

    /**
     * 添加
     *
     * @param key key
     */
    public String getStr(String key) {
        return valueOperations.get(key);
    }

    /**
     * 删除
     *
     * @param key key
     */
    public void removeStr(String key) {
        redisTemplate.delete(key);
    }

    /**
     * 封装和jedis方法
     * 可用于分布式锁
     *
     * @param key
     * @param expire 毫秒
     * @return
     */
    public boolean setNX(final String key, long expire) {
//        RedisCallback<String> callback = (connection) -> {
//            JedisCommands commands = (JedisCommands) connection.getNativeConnection();
//            String uuid = UUID.randomUUID().toString();
//            return commands.set(key, uuid, "NX", "PX", expire);
//        };
//        String result = redisTemplate.execute(callback);
        return CommonUtils.isNotBlank("");

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
     *
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
