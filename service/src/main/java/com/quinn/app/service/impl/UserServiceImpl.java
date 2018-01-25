package com.quinn.app.service.impl;

import com.quinn.app.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.app.dao.UserDao;
import com.quinn.BaseServiceImpl;

/**
 * @author Quinn
 * @date 2018/1/17
 */
@Service("UserService")
public class UserServiceImpl extends BaseServiceImpl<UserDao> implements UserService {

    @Autowired
    private UserDao userDao;
}
