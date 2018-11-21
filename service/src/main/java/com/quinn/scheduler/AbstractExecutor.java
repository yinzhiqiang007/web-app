package com.quinn.scheduler;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractExecutor implements Executor {

    public static Map<Integer,Long> schedulerMap = new HashMap<>();
    static {
        schedulerMap.put(1,1l);
        schedulerMap.put(2,2l);
        schedulerMap.put(3,8l);
        schedulerMap.put(4,30l);
        schedulerMap.put(5,120l);
        schedulerMap.put(6,1200l);
        schedulerMap.put(7,1800l);
        schedulerMap.put(8,3600l);
//        schedulerMap.put(9,12000l);
//        schedulerMap.put(10,86400l);
    }
}
