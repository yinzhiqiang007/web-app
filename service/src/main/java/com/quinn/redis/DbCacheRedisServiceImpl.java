package com.quinn.redis;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Quinn
 * @date 2018/2/6
 * @package com.quinn.common
 * 数据库缓存数据
 */
@Component("dbCacheRedisService")
public class DbCacheRedisServiceImpl extends  IRedisService<Object> {

    private static final String REDIS_KEY = "DB_CACHE_REDIS_KEY";


    @Override
    protected String getRedisKey() {
        return this.REDIS_KEY;
    }

    @PostConstruct
    @Override
    protected void init() {
        System.out.println("DbCacheRedisServiceImpl.............");
    }
}
