package com.quinn.util;

import com.alibaba.fastjson.JSON;
import com.quinn.app.model.entity.User;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class UserCallabe implements Callable {

    private User user;
    private CountDownLatch countDownLatch;
    private String sss;
    public UserCallabe(User user){
        this.user = user;
        this.countDownLatch = new CountDownLatch(1);
    }
    public UserCallabe(User user,CountDownLatch countDownLatch,String sss){
        this.user = user;
        this.countDownLatch = countDownLatch;
        this.sss = sss;
    }

    @Override
    public Object call() {
        user.setAddress("sdfsfsfs");
        System.out.println(JSON.toJSONString(user));
        user = new User();
        user.setAddress("dddddd");
        System.out.println(countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
        sss = "user thread";
        System.out.println("sss:"+sss);
        System.out.println(sss);
        return null;
    }
}
