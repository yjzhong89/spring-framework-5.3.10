package com.zyj;

import com.zyj.config.ApplicationConfig;
import com.zyj.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		UserService userService = (UserService) context.getBean("userService");
		userService.test();

		// FactoryBean
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		System.out.println(context.getBean("myFactory"));
	}
}
