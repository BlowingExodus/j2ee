package com.pugwoo.service;

/**
 * 2012年11月20日 16:59:09
 */
public class UserServiceImpl implements UserService {

	@Override
	public String getInfo() {
		return "This is spring remote service";
	}

	@Override
	public String sayHello(String name) {
		return "hello: " + name;
	}

}
