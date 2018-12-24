package com.quinn.scheduler;

import com.alibaba.fastjson.JSON;
import com.quinn.app.common.constans.ResponseEnum;
import com.quinn.app.common.util.CommonUtils;
import com.quinn.app.common.util.LogUtils;
import com.quinn.util.SpringUtil;
import com.quinn.util.ThreadPoolUtil;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Scheduler implements Callable {
    private int count;//执行次数
    private Map<String, Object> map;//参数
    private int chainIndex;//被执行责任链的当前位置
    private String[] beanChain;//被执行责任链

    public Scheduler(int count, Map<String, Object> map, int chainIndex, String[] beanChain) {
        this.count = count;
        this.map = map;
        this.chainIndex = chainIndex;
        this.beanChain = beanChain;

    }

    public Scheduler(Map<String, Object> map,String[] beanChain) {
        this.count = AbstractExecutor.first_invoke;
        this.map = map;
        this.chainIndex = AbstractExecutor.chain_index;
        this.beanChain = beanChain;

    }

    @Override
    public Object call() throws Exception {
        String beanName = beanChain[chainIndex];
        if (count == AbstractExecutor.first_invoke) {
            map.put("chainId", CommonUtils.getUUIDString());
        }
        Executor handler = (Executor) SpringUtil.getBean(beanName);
        boolean b = handler.invoke(map);
        if (!b) {
            LogUtils.error(ResponseEnum.code_999999.name(), "执行器执行返回异常..:" + JSON.toJSONString(map));
            count++;
            Long c = AbstractExecutor.schedulerMap.get(count);
            if (c != null) {
                ThreadPoolUtil.scheduledThreadPool.schedule(new Scheduler(count, map, chainIndex, beanChain), c, TimeUnit.SECONDS);
            } else {
                AbstractExecutor.concurrentHashMap.remove(map.get("chainId").toString());
                LogUtils.error(ResponseEnum.code_999999.name(), "执行器执行返回异常，超出最大执行次数count:" + count + "bean:" + beanName + "param:" + JSON.toJSONString(map));
            }
        } else {
            chainIndex++;
            if (chainIndex < beanChain.length) {
                ThreadPoolUtil.threadPool.submit(new Scheduler(AbstractExecutor.first_invoke, map, chainIndex, beanChain));
            }else{
                AbstractExecutor.concurrentHashMap.remove(map.get("chainId").toString());
                LogUtils.info(ResponseEnum.code_000000.name(), "执行器执行完毕，bean:" + beanName + "param:" + JSON.toJSONString(map));
            }
        }
        return "ok";
    }


}
