package com.bharath.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {



    @RequestMapping("/welcome")
    public String greet()
    {
        return "Welcome bharath";
    }
}
