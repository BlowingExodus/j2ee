package com.googlecode.excavator.demo.service.impl;

import com.googlecode.excavator.demo.service.SayHelloService;

/**
 * SayHello�����ʵ��
 * @author vlinux
 *
 */
public class SayHelloServiceImpl implements SayHelloService {

	public String sayTo(String name) {
		return "hello:"+name;
	}

}
