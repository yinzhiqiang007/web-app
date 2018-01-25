package com.quinn.payment.service.impl;

import com.quinn.payment.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.payment.dao.PaymentDao;
import com.quinn.BaseServiceImpl;

/**
 * @author Quinn
 * @date 2018/1/17
 */
@Service("PaymentService")
public class PaymentServiceImpl extends BaseServiceImpl<PaymentDao> implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;
}
