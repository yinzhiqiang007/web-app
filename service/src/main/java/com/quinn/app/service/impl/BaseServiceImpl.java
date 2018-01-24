package com.quinn.app.service.impl;

import com.quinn.app.dao.BaseDao;
import com.quinn.app.model.Base;
import com.quinn.app.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Quinn
 * @date 2018/1/17
 * @package com.quinn.app.service
 */
public class BaseServiceImpl implements BaseService {
    @Autowired
    private BaseDao baseDao;

    @Override
    public <T extends Base> T getById(String id) {
        return baseDao.getById(id);
    }

    @Override
    public int insert(Base entity) {
        return baseDao.insert(entity);
    }

    @Override
    public int updateById(Base entity) {
        return baseDao.updateById(entity);
    }

    @Override
    public int updateByIdSelective(Base entity) {
        return baseDao.updateByIdSelective(entity);
    }
}
