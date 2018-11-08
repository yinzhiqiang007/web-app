package com.quinn.app.controller;

import com.quinn.app.common.util.ResponseUtils;
import com.quinn.app.model.entity.SysConfig;
import com.quinn.app.service.SysConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Quinn
 * @date 2018/1/18 test
 * @package com.quinn.app.controller
 */
@Controller
@RequestMapping("/config/")
public class SysConfigController {

    private final static Logger logger = LoggerFactory.getLogger(SysConfigController.class);

    @Autowired
    private SysConfigService sysConfigService;


    @RequestMapping("/updateByCode")
    @ResponseBody
    public ResponseUtils test3(SysConfig sysConfig){
        return sysConfigService.updateByCode(sysConfig);
    }


}
