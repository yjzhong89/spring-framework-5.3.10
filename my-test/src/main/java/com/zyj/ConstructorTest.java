package com.zyj;

import com.zyj.config.ApplicationConfig;
import com.zyj.service.DetailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		DetailService detailService = context.getBean(DetailService.class);
	}
}
