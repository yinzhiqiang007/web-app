package com.quinn.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Quinn
 * @date 2018/1/25
 * @package com.quinn.app.config
 */
@ConfigurationProperties(prefix = "jdbc.database", locations = "classpath:jdbc.properties")
public class Jdbc {
    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
