package com.zyj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.inject.Named;

//@Component("userService")
//@ManagedBean("userService")
//@Named
public class UserService {
	private DetailService detailService;

	public void test() {
		System.out.println(detailService);
	}

	public void setDetailService(DetailService detailService) {
		this.detailService = detailService;
	}
}
