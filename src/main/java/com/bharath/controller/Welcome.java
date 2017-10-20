package com.bharath.controller;

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

    @RequestMapping("/")
    public String greet()
    {
        return "Welcome bharath"+notificationService.getMessage();
    }

    @RequestMapping("/picasso")
    public String greet()
    {
        return "Welcome bharath"+notificationService.getMessage();
    }
}
