package com.quinn.scheduler;


import com.quinn.app.common.constans.ResponseEnum;
import com.quinn.app.common.util.LogUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("userExecutor")
public class UserExecutor extends AbstractExecutor {
    @Override
    public boolean invoke(Map<String, Object> map) {


        LogUtils.error(ResponseEnum.code_999999.name(), "执行器执行返回异常.");
        return false;
    }
}
