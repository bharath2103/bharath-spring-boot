package com.bharath.controller;

import com.bharath.config.PageController;
import com.bharath.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ComponentScan("com.bharath.service")
public class Welcome {

    @Autowired
    public NotificationService notificationService;

    @Autowired
    public PageController pageController;

    @RequestMapping("/")
    public String greet()
    {
        return "Welcome everyone";
    }

    @RequestMapping("/picasso")
    public String greetpicasso()
    {
        return "Welcome bharath"+notificationService.getMessage();
    }

    @RequestMapping("/yml")
    public String ymlconfig()
    {
        return "Welcome bharath"+pageController.getMsg();
    }
}
