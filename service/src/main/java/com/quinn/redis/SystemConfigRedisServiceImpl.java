package com.quinn.redis;

import com.quinn.keygenerate.KeyGenerate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * @author Quinn
 * @date 2018/2/6
 * @package com.quinn.common
 * 用于系统配置参数
 */
@Component("systemConfigRedisService")
public class SystemConfigRedisServiceImpl extends  IRedisService<Object> {

    private static final String REDIS_KEY = "SYSTEM_CONFIG_REDIS_KEY";

    @PostConstruct
    @Override
    public void init(){
        System.out.println("SystemConfigRedisServiceImpl.............");
    }

    @Override
    protected String getRedisKey() {
        return this.REDIS_KEY;
    }

}
