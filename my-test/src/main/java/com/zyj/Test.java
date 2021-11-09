package com.zyj;

import com.zyj.config.ApplicationConfig;
import com.zyj.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		IUserService userService = (IUserService) context.getBean("userService");
		userService.test();
	}
}
