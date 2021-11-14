package com.zyj.config;

import com.zyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.zyj")
@Configuration
public class ApplicationConfig {
	@Bean
	public UserService userService() {
		return new UserService();
	}
}
