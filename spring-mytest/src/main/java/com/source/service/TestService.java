package com.source.service;

import org.springframework.stereotype.Service;

/**
 * @author luodong
 * @create 2019-07-01 18:09
 **/
@Service
public class TestService {

	public TestService() {
		System.out.println("TestService.....");
	}

	public void sayHello() {
		System.out.println("sayHello......");
	}
}