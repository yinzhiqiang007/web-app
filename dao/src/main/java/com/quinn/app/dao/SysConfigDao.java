package com.quinn.app.dao;

import java.util.*;
import org.springframework.stereotype.Repository;
import com.quinn.BaseDao;
import com.quinn.app.model.entity.SysConfig;

/**
 * @author Quinn
 * @date 2018/09/14
 */
@Repository
public interface SysConfigDao extends BaseDao {
        List<SysConfig> listByEntity(SysConfig entity);

}
