package com.quinn.common;

import org.springframework.stereotype.Component;

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
}
