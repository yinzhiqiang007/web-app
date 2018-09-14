package com.quinn.app.service.impl;

import com.quinn.app.service.SysConfigService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.quinn.app.dao.SysConfigDao;
import com.quinn.BaseServiceImpl;

/**
 * @author Quinn
 * @date 2018/09/14
 */
@Service("sysConfigService")
public class SysConfigServiceImpl extends BaseServiceImpl<SysConfigDao> implements SysConfigService {

    @Autowired
    private SysConfigDao sysConfigDao;
}
