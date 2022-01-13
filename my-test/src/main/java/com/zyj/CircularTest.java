package com.zyj;

import com.zyj.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ApplicationConfig.class);
//		context.setAllowCircularReferences(false);
		context.refresh();
		context.getBean("AService");
	}
}
