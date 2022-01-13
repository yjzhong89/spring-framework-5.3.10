package com.zyj.circularTest;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BService {
	@Resource
	private AService aService;
}
