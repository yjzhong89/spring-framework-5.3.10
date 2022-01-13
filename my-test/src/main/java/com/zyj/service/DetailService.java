package com.zyj.service;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

//@Component
public class DetailService {
	public void detail() {
		System.out.println("---detail---");
	}

	public DetailService(String name) {
		System.out.println("1111");
	}

	public DetailService(String name, int age) {
		System.out.println(2222);
	}
}
