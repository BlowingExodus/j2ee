package com.pugwoo;

import java.io.FileNotFoundException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskApp {

	public static void main(String[] args) throws BeansException,
			FileNotFoundException, InterruptedException {
		
		@SuppressWarnings("unused")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/quartz.xml");
		
		// ��ʱ����Ⱦ��Ѿ���ʼִ����

	}

}