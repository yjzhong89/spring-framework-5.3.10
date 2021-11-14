package com.zyj.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("myFactory")
public class MyFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new UserService();
	}

	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
