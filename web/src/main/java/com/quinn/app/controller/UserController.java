package com.quinn.app.controller;

import com.alibaba.fastjson.JSON;
import com.quinn.app.common.constans.ResponseEnum;
import com.quinn.app.common.constans.ResponseUtils;
import com.quinn.app.common.constans.SystemConstatns;
import com.quinn.app.config.Test;
import com.quinn.app.model.entity.User;
import com.quinn.app.service.SysAreaService;
import com.quinn.app.service.UserService;
import com.quinn.keygenerate.KeyGenerate;
import com.quinn.keygenerate.KeyGenerateEnum;
import com.quinn.payment.service.BankService;
import com.quinn.redis.IRedisService;
import com.quinn.redis.RedisLock;
import com.quinn.util.ThreadPoolUtil;
import com.quinn.util.UserCallabe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

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
    private IRedisService systemConfigRedisService;

    @Autowired
    private IRedisService dbCacheRedisService;

    @Autowired
    private KeyGenerate redisKeyGenerate;

    @Autowired
    private SysAreaService sysAreaService;

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,Object> test(String id){

        boolean b = systemConfigRedisService.lock("dddd",20000);
        System.out.println("===="+b);
//        systemConfigRedisService.unlock("dddd");
        systemConfigRedisService.put("hehehehe","ttttt",200);
//        lock.unlock();
        Map<String,Object> resultMap = new HashMap();
        System.out.println(this.test.getSs());
        User user = userService.getById("U2018112315131200001");
        this.userService.updateTest(user);
        resultMap.put("user",user);
        resultMap.put("bank",bankService.getById(id));
        logger.info("web_app test.....");
        return resultMap;
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResponseUtils save(User user){
        String u = redisKeyGenerate.generateStringKey(KeyGenerateEnum.U);
        user.setId(u);
        this.userService.insert(user);
        return ResponseEnum.code_000000.result();
    }

    @RequestMapping("/test2")
    @ResponseBody
    public Object test2(String id){
//        Object o = bankService.getList();
        Object o = this.sysAreaService.listByParentCode(SystemConstatns.SYS_AREA_CHINA_CODE);

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
        this.dbCacheRedisService.removeStr("dddddddd");
        return "user/user";
    }

    @RequestMapping("/facePage")
    public String facePage(){
        return "face-demo";
    }

    @RequestMapping("page")
    public String page(HttpServletRequest request, ModelMap model){
        model.put("page", "page");
        request.setAttribute("page", "page");
        return "page";
    }

    @RequestMapping("/face")
    @ResponseBody
    public Object face(@RequestParam("file") MultipartFile file) throws IOException {
        String s = FaceTest.getFace(file.getInputStream());
        return s;
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cc = new CountDownLatch(1);
        User u = new User();
        u.setGender(1);
        u.setMobile("15216884688");
        String sss= "init";
        Callable c = new UserCallabe(u,cc,sss);
        ThreadPoolUtil.threadPool.submit(c);
        cc.await();
        System.out.println(JSON.toJSONString(u)+"main");
        System.out.println("sss main:"+sss);
        ThreadPoolUtil.threadPool.shutdown();
    }
}
