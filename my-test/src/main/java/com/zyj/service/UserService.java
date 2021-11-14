package com.zyj.service;

import org.springframework.beans.factory.annotation.Autowired;

//@Component("userService")
//@ManagedBean("userService")
public class UserService {
	private DetailService detailService;

	public void test() {
		System.out.println(detailService);
	}

	public void setDetailService(DetailService detailService) {
		this.detailService = detailService;
	}
}
