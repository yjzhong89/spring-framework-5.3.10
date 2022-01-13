package com.zyj.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class LookupService {
	@Lookup
	public abstract void test();
}
