package com.zyj.service.impl;

import com.zyj.service.IUserService;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements IUserService {
	@Override
	public void test() {
		System.out.println("---test---");
	}
}
