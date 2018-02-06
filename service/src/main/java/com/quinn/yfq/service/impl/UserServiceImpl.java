package com.quinn.yfq.service.impl;

import com.quinn.yfq.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.yfq.dao.UserDao;
import com.quinn.BaseServiceImpl;

/**
 * @author Quinn
 * @date 2018/02/06
 */
@Service("yfqUserService")
public class UserServiceImpl extends BaseServiceImpl<UserDao> implements UserService {

    @Autowired
    private UserDao userDao;
}
