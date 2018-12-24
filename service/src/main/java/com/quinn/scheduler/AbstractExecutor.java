package com.quinn.scheduler;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractExecutor implements Executor {

    public static Map<Integer, Long> schedulerMap = new HashMap<>();

    static {
        schedulerMap.put(1, 1l);
        schedulerMap.put(2, 2l);
        schedulerMap.put(3, 8l);
        schedulerMap.put(4, 30l);
        schedulerMap.put(5, 120l);
        schedulerMap.put(6, 1200l);
        schedulerMap.put(7, 1800l);
        schedulerMap.put(8, 3600l);
//        schedulerMap.put(9,12000l);
//        schedulerMap.put(10,86400l);
    }

    /**
     * 第一次请求
     */
    public static final int first_invoke = 1;

    /*** 责任链起始位置 */
    public static int chain_index = 0;

    /**
     * 存放链条每个节点结果，用户下一个链条使用
     */
    public static Map<String, Object> concurrentHashMap = new ConcurrentHashMap<>();


    /**
     * 注册链
     */
    public static final String[] user_chain = new String[]{"userExecutor"};
}
