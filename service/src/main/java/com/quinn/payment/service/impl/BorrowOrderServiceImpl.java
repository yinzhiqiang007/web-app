package com.quinn.payment.service.impl;

import com.quinn.payment.service.BorrowOrderService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.payment.dao.BorrowOrderDao;
import com.quinn.BaseServiceImpl;

/**
 * @author Quinn
 * @date 2018/1/17
 */
@Service("BorrowOrderService")
public class BorrowOrderServiceImpl extends BaseServiceImpl<BorrowOrderDao> implements BorrowOrderService {

    @Autowired
    private BorrowOrderDao borroworderDao;
}
