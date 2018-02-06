package com.quinn.yfq.service.impl;

import com.quinn.yfq.service.UserInfService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.yfq.dao.UserInfDao;
import com.quinn.BaseServiceImpl;

/**
 * @author Quinn
 * @date 2018/02/06
 */
@Service("userinfService")
public class UserInfServiceImpl extends BaseServiceImpl<UserInfDao> implements UserInfService {

    @Autowired
    private UserInfDao userinfDao;
}
