package com.quinn.payment.service.impl;

import com.quinn.payment.service.CallbackLogService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.payment.dao.CallbackLogDao;
import com.quinn.BaseServiceImpl;

/**
 * @author Quinn
 * @date 2018/1/17
 */
@Service("CallbackLogService")
public class CallbackLogServiceImpl extends BaseServiceImpl<CallbackLogDao> implements CallbackLogService {

    @Autowired
    private CallbackLogDao callbacklogDao;
}
