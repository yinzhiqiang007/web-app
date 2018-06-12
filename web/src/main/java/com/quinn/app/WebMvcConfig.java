package com.quinn.app;

import com.quinn.app.handler.StringToDateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;

/**
 * @author Quinn
 * @date 2018/1/24
 * @package com.quinn.app
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        System.out.println("WebMvcConfig");
//        registry.jsp("/WEB-INF/view/", ".jsp");

    }

//    @Bean
//    public LoginInterceptor loginInterceptor() {
//        return new LoginInterceptor();
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
//        registry.addInterceptor(loginInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @PostConstruct
    public void initEditableValidation() {
        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter.getWebBindingInitializer();
        if (initializer.getConversionService() != null) {
            GenericConversionService genericConversionService = (GenericConversionService) initializer.getConversionService();
            genericConversionService.addConverter(new StringToDateConverter());
        }

    }

}
