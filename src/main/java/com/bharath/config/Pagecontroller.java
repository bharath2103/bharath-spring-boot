package com.bharath.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by A-7787 on 05-03-2018.
 */

@ConfigurationProperties(prefix = "pagecontroller")
@Configuration
public class PageController {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
