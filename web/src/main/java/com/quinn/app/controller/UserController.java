package com.quinn.app.controller;

import com.quinn.app.common.util.CommonUtil;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Quinn
 * @date 2018/1/18
 * @package com.quinn.app.controller
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "sss";
    }

    @RequestMapping("/user")
    public String user(){
        return "user/user";
    }

    @RequestMapping("page")
    public String page(HttpServletRequest request, ModelMap model){
        model.put("page", "page");
        request.setAttribute("page", "page");
        return "page";
    }
}
