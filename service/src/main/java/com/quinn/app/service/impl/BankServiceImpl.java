package com.quinn.app.service.impl;

import com.quinn.app.service.BankService;
import com.quinn.payment.dao.BankDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.ArrayList;

/**
 * @author Quinn
 * @date 2018/1/17
 */
@Service("bankService")
public class BankServiceImpl extends BaseServiceImpl implements BankService {
//
//    @Autowired
//    private BankDao bankDao;


    @Override
    public void test() {
//        bankDao.getById("123");
    }
}
