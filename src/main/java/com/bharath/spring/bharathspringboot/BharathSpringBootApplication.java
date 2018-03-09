package com.bharath.spring.bharathspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"Controller","Model"})
public class BharathSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BharathSpringBootApplication.class, args);
	}
}
