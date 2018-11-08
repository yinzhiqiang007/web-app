package com.quinn.app.service;

import com.quinn.BaseService;
import com.quinn.app.common.util.ResponseUtils;
import com.quinn.app.model.entity.User;

/**
 * @author Quinn
 * @date 2018/1/15
 */
public interface UserService extends BaseService {

    int updateTest(User user);

    ResponseUtils getList(User user);

}
