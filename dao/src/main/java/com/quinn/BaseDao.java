package com.quinn;

/**
 * @author Quinn
 * @date 2018/1/15
 * @package com.quinn.app.dao
 */
public interface BaseDao {
    <T extends Base> T getById(String id);
    int insert(Base entity);
    int updateById(Base entity);
    int updateByIdSelective(Base entity);


}
