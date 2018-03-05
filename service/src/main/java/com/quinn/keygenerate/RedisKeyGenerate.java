package com.quinn.keygenerate;

import com.alibaba.druid.util.StringUtils;
import com.quinn.redis.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Quinn
 * @date 2018/3/2
 * @package com.quinn.keygenerate
 */
@Service("redisKeyGenerate")
public class RedisKeyGenerate extends BaseKeyGenerate {

    @Autowired
    private IRedisService systemConfigRedisService;

    @Override
    public String generateStringKey(KeyGenerateEnum em) {
        Long id = generateLongKey(em);
        if (id != null) {
            return em.name() + id;
        } else {
            return super.generateStringKey(em);
        }
    }

    @Override
    public Long generateLongKey(KeyGenerateEnum em) {
        Long id =  systemConfigRedisService.getKey(em);
        return id;
    }
}
