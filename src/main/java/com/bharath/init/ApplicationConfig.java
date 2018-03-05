package com.bharath.init;

import com.bharath.config.PageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by A-7787 on 05-03-2018.
 */
@Configuration
@EnableConfigurationProperties(PageController.class)
public class ApplicationConfig {

    public ApplicationConfig() {
        System.out.println("steven");
    }


    @Autowired
    public PageController pageController(PageController configuration){
        PageController pageController = new PageController();
        pageController.setMsg(configuration.getMsg());
        return pageController;
    }
}
