package com.zyj;

import com.zyj.beanFactoryPostProcessor.MyBeanFactoryPostProcessor;
import com.zyj.config.ApplicationConfig;
import com.zyj.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		context.register(UserService.class);
//		context.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		UserService userService = (UserService) context.getBean("111");
		userService.test();
//		System.out.println(context.getBean("ABTest"));

		// FactoryBean
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		System.out.println(context.getBean("myFactory"));
	}
}
