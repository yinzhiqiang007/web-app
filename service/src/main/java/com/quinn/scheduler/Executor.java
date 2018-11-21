package com.quinn.scheduler;

import java.util.Map;

public interface Executor {

    boolean invoke(Map<String, Object> map);



}
