package com.quinn.payment.service.impl;

import com.quinn.payment.model.entity.Bank;
import com.quinn.payment.service.BankService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.payment.dao.BankDao;
import com.quinn.BaseServiceImpl;

import java.util.List;

/**
 * @author Quinn
 * @date 2018/1/17
 */
@Service("BankService")
public class BankServiceImpl extends BaseServiceImpl<BankDao> implements BankService {

    @Autowired
    private BankDao bankDao;

    @Override
    public List<Bank> getList() {
        return bankDao.getList();
    }
}
