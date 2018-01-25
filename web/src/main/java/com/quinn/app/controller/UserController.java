package com.quinn.app.controller;

import com.quinn.app.service.UserService;
import com.quinn.payment.model.entity.Bank;
import com.quinn.payment.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Quinn
 * @date 2018/1/18
 * @package com.quinn.app.controller
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private BankService bankService;

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,Object> test(String id){
        Map<String,Object> resultMap = new HashMap();
        resultMap.put("user",userService.getById("123"));
        resultMap.put("bank",bankService.getById(id));
        return resultMap;
    }
    @RequestMapping("/test2")
    @ResponseBody
    public Object test2(String id){
        Object o = bankService.getList();
        return o;
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
