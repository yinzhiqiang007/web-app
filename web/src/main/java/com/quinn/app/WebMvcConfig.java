package com.quinn.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Quinn
 * @date 2018/1/24
 * @package com.quinn.app
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        System.out.println("WebMvcConfig");
//        registry.jsp("/WEB-INF/view/", ".jsp");

    }

}
