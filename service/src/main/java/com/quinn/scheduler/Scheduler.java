package com.quinn.scheduler;

import com.alibaba.fastjson.JSON;
import com.quinn.app.common.constans.ResponseEnum;
import com.quinn.app.common.util.LogUtils;
import com.quinn.util.SpringUtil;
import com.quinn.util.ThreadPoolUtil;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Scheduler implements Callable {
    private String beanName;
    private Integer count;
    private Map<String, Object> map;

    public Scheduler(String beanName, Integer count, Map<String, Object> map) {
        this.beanName = beanName;
        this.count = count;
        this.map = map;

    }

    @Override
    public Object call() throws Exception {
        Executor handler = (Executor) SpringUtil.getBean(beanName);
        boolean b = handler.invoke(map);
        if (!b) {
            LogUtils.error(ResponseEnum.code_999999.name(), "执行器执行返回异常...count:" + count);
            count++;
            Long c = AbstractExecutor.schedulerMap.get(count);
            if (c != null) {
                ThreadPoolUtil.scheduledThreadPool.schedule(new Scheduler(beanName, count, map), c, TimeUnit.SECONDS);
            } else {
                LogUtils.error(ResponseEnum.code_999999.name(), "执行器执行返回异常，超出最大执行次数count:" + count + "bean:" + beanName + "param:" + JSON.toJSONString(map));
            }
        }
        return "ok";
    }


}
