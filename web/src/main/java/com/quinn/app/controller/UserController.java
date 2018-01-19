package com.quinn.app.controller;

import com.quinn.app.common.util.CommonUtil;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Quinn
 * @date 2018/1/18
 * @package com.quinn.app.controller
 */
@Controller
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "sss";
    }
}
