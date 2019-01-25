package com.quinn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Quinn
 * @date 2018/1/18
 * @package com.quinn.app
 */
@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages={"com.quinn"})
//public class Application extends SpringBootServletInitializer {
public class Application  {

    /**
     * 将spring boot配置信息build到容器
     * @param application
     * @return
     */
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        System.out.println("test1");
//        return application.sources(Application.class);
//    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class ,args);
    }
}
