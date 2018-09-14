package com.quinn.app.dao;

import com.quinn.BaseDao;
import com.quinn.app.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Quinn
 * @date 2018/1/15
 */
@Repository
public interface UserDao extends BaseDao {

    List<User> listByEntity(User entity);

    int updateTest(User user);
}
