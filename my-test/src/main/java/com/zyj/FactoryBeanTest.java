package com.zyj;

import com.zyj.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println(context.getBean("myFactoryBean"));
	}
}
