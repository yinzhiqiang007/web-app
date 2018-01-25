package com.quinn.payment.service;

import java.util.*;
import com.quinn.BaseService;
import com.quinn.payment.model.entity.Bank;

/**
 * @author Quinn
 * @date 2018/1/15
 */
public interface BankService extends BaseService {
    List<Bank> getList();
}
