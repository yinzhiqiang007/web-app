package com.quinn.app.service;

import java.util.*;
import com.quinn.BaseService;
import com.quinn.app.model.entity.SysArea;

/**
 * @author Quinn
 * @date 2018/09/14
 */
public interface SysAreaService extends BaseService {

    List<SysArea> listByParentCode(String parentCode);
}
