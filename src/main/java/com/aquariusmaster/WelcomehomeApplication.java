package com.aquariusmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@EnableAutoConfiguration
@SpringBootApplication
public class WelcomehomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomehomeApplication.class, args);
	}
}
