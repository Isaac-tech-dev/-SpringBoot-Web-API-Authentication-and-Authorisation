package com.isaac.Web.API.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApiSecurityApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebApiSecurityApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(){
		return "Hello World this is my first program";
	}
}
