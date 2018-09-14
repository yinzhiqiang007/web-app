package com.quinn.app.dao;

import java.util.*;
import org.springframework.stereotype.Repository;
import com.quinn.BaseDao;
import com.quinn.app.model.entity.SysArea;

/**
 * @author Quinn
 * @date 2018/09/14
 */
@Repository
public interface SysAreaDao extends BaseDao {
        List<SysArea> listByEntity(SysArea entity);

}
