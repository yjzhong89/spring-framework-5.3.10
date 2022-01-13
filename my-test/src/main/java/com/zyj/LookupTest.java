package com.zyj;

import com.zyj.config.ApplicationConfig;
import com.zyj.service.LookupService;
import com.zyj.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		LookupService lookupService = context.getBean(LookupService.class);
		System.out.println(lookupService);
	}
}
