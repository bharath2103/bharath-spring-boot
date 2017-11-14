package com.bharath.controller;

import com.bharath.configuration.AppConfig;
import com.bharath.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ComponentScan({"com.bharath.service","com.bharath.configuration"})
public class Welcome {

    @Autowired
    public NotificationService notificationService;

    @Autowired
    public AppConfig appConfig;

    @RequestMapping("/")
    public String greet()
    {
        return "Welcome bharath"+notificationService.getMessage();
    }

    @RequestMapping("/picasso")
    public String greetpicasso()
    {
        return "Welcome bharath"+notificationService.getMessage();
    }

    @RequestMapping("/greet")
    public String greetme()
    {
        return "Welcome" + appConfig.getFirstName()+" "+appConfig.getLastName();
    }
}
