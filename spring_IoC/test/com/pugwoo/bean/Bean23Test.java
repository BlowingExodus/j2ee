package com.pugwoo.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class Bean23Test extends TestCase{

	public void testBean1(){
		//ȡ��bean����
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext-bean23.xml");
	    //ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*��IoC�������ö��󣬵���bean2ʱ��bean2������bean3���Զ�����*/
	    Bean2 bean2 = (Bean2)factory.getBean("bean2");
	    System.out.println("------------bean23------------");
	    System.out.println("bean2.bean3.name="+bean2.getBean3().getName());
	}
}
