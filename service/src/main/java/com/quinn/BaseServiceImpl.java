package com.quinn;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Quinn
 * @date 2018/1/17
 * @package com.quinn.app.service
 */
public class BaseServiceImpl<DAO extends  BaseDao> implements BaseService {
    @Autowired
    private DAO baseDao;

    @Override
    public <T extends Base> T getById(String id) {
        T t = baseDao.getById(id);
        return t;
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
