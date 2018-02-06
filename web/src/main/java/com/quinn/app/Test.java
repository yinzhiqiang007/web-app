package com.quinn.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Quinn
 * @date 2018/2/5
 * @package com.quinn.app
 */
//@ConfigurationProperties
@PropertySource("classpath:config/dev/jdbc.properties")
@Component
public class Test {

    @Value("${test.msg}")
    private String ss;

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }
}
