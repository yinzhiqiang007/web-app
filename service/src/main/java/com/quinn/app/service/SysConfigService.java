package com.quinn.app.service;

import java.util.*;
import com.quinn.BaseService;
import com.quinn.app.common.util.RestResult;
import com.quinn.app.model.entity.SysConfig;

/**
 * @author Quinn
 * @date 2018/09/14
 */
public interface SysConfigService extends BaseService {

    /**
     * 更新配置
     * @param sysConfig
     * @return
     */
    RestResult updateByCode(SysConfig sysConfig);

}
