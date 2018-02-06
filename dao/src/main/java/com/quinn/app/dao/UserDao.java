package com.quinn.app.dao;

import java.util.*;

import com.quinn.BaseDao;
import com.quinn.app.model.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Quinn
 * @date 2018/1/15
 */
@Repository
public interface UserDao extends BaseDao {

    int updateTest(User user);
}
