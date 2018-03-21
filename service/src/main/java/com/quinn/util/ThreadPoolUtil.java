package com.quinn.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author Quinn
 * @date 2018/3/21
 * @package com.quinn.util
 */
public class ThreadPoolUtil {


    public static ExecutorService threadPool = Executors.newFixedThreadPool(5);


    public static ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
}
