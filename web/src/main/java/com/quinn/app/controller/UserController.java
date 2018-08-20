package com.quinn.app.controller;

import com.quinn.app.config.Test;
import com.quinn.app.model.entity.User;
import com.quinn.app.service.UserService;
import com.quinn.keygenerate.KeyGenerate;
import com.quinn.keygenerate.KeyGenerateEnum;
import com.quinn.payment.service.BankService;
import com.quinn.redis.IRedisService;
import com.quinn.redis.RedisConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * @date 2018/1/18 test
 * @package com.quinn.app.controller
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private BankService bankService;

    @Autowired
    private UserService userService;


    @Autowired
    private Test test;

    @Autowired
    private RedisConfig redisConfig;

    @Autowired
    private IRedisService systemConfigRedisService;

    @Autowired
    private KeyGenerate redisKeyGenerate;

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,Object> test(String id){
        System.out.println("1111");
        System.out.println("2222");
        System.out.println("3333");
        systemConfigRedisService.setNX("dddd","sd水电费水电费");
        systemConfigRedisService.put("hehehehe","ttttt",200);
        Map<String,Object> resultMap = new HashMap();
        System.out.println(this.test.getSs());
        User user = userService.getById("123");
        this.userService.updateTest(user);
        resultMap.put("user",user);
        resultMap.put("bank",bankService.getById(id));
        logger.info("web_app test.....");
        return resultMap;
    }
    @RequestMapping("/test2")
    @ResponseBody
    public Object test2(String id){
        Object o = bankService.getList();
        return o;
    }
    @RequestMapping("/test3")
    @ResponseBody
    public Object test3(){
        String p = redisKeyGenerate.generateStringKey(KeyGenerateEnum.P);
        String c = redisKeyGenerate.generateStringKey(KeyGenerateEnum.C);
        Map<String,String> result = new HashMap<String,String>();
        result.put("p",p);
        result.put("c",c);
        return result;
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

    public static void main(String[] args) {

    }
}
