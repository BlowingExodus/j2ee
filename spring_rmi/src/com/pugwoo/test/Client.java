package com.pugwoo.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pugwoo.service.UserService;

/**
 * 2012年11月20日 17:16:08
 */
public class Client {

	public static void main(String[] args) {

		BeanFactory f = new ClassPathXmlApplicationContext(
				"applicationContext-client.xml");

		// 获取到远程的remote对象
		UserService userService = (UserService) f.getBean("userService");

		System.out.println(userService.getInfo());

		System.out.println(userService.sayHello("nick"));
	}

}
