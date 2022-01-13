package com.zyj.circularTest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@EnableAsync
public class AService {
	@Resource
	private BService bService;

//	@Async
	public void test() {
		System.out.println("test");
	}
}
