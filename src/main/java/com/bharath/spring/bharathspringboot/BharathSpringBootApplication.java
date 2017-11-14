package com.bharath.spring.bharathspringboot;

import com.bharath.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bharath.controller","com.bharath.service"})
@EnableConfigurationProperties
public class BharathSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BharathSpringBootApplication.class, args);
	}

}
