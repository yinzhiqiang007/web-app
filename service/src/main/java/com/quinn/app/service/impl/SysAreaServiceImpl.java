package com.quinn.app.service.impl;

import com.quinn.app.model.entity.SysArea;
import com.quinn.app.service.SysAreaService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.app.dao.SysAreaDao;
import com.quinn.BaseServiceImpl;

import java.util.List;

/**
 * @author Quinn
 * @date 2018/09/14
 */
@Service("sysAreaService")
public class SysAreaServiceImpl extends BaseServiceImpl<SysAreaDao> implements SysAreaService {

    @Autowired
    private SysAreaDao sysAreaDao;

    @Override
    public List<SysArea> listByParentCode(String parentCode) {
        SysArea sysArea = new SysArea();
        sysArea.setParentCode(parentCode);
        return this.sysAreaDao.listByEntity(sysArea);
    }
}
