package com.quinn.payment.dao;



import com.quinn.BaseDao;
import com.quinn.payment.model.entity.Bank;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author Quinn
 * @date 2018/1/15
 */
@Repository
public interface BankDao extends BaseDao {
    List<Bank> getList();
}
