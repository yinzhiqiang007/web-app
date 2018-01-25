package com.quinn;

/**
 * @author Quinn
 * @date 2018/1/17
 * @package com.quinn.app.service
 */
public interface BaseService {
    <T extends Base> T getById(String id);
    int insert(Base entity);
    int updateById(Base entity);
    int updateByIdSelective(Base entity);
}
