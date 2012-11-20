package com.pugwoo.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class Bean4Test extends TestCase{

	public void testBean1(){
		//ȡ��bean����
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext-bean4.xml");
	    //ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*��IoC�������ö���*/
	    Bean4 bean4 = (Bean4)factory.getBean("bean4");
	    System.out.println("-------------bean4--------------");
	    System.out.println("bean4.date="+bean4.getDate().toString());
	}
}
