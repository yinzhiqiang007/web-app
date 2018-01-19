package com.quinn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Quinn
 * @date 2018/1/18
 * @package com.quinn.app
 */
//@EnableAutoConfiguration
//@SpringBootApplication
//@ComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class ,args);
    }
}
