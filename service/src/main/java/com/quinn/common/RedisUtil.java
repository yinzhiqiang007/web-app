package com.quinn.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author Quinn
 * @date 2018/2/6
 * @package com.quinn.common
 */
@Component
public class RedisUtil {
    @Autowired
    private JedisPool jedisPool;

    public void set(String key, String value)  {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            //返还到连接池
            if(null !=jedis ){
                jedis.close();
            }
        }
    }



    public String get(String key) throws Exception  {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.get(key);
        } finally {
            //返还到连接池
            jedis.close();
        }
    }
}
