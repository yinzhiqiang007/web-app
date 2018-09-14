package com.quinn.app.service;

import java.util.*;
import com.quinn.BaseService;
import com.quinn.app.common.util.RestResult;
import com.quinn.app.model.entity.User;

/**
 * @author Quinn
 * @date 2018/1/15
 */
public interface UserService extends BaseService {

    int updateTest(User user);

    RestResult getList(User user);

}
