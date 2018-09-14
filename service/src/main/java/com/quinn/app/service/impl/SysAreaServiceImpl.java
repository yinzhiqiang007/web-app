package com.quinn.app.service.impl;

import com.quinn.app.service.SysAreaService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.app.dao.SysAreaDao;
import com.quinn.BaseServiceImpl;

/**
 * @author Quinn
 * @date 2018/09/14
 */
@Service("sysAreaService")
public class SysAreaServiceImpl extends BaseServiceImpl<SysAreaDao> implements SysAreaService {

    @Autowired
    private SysAreaDao sysAreaDao;
}
