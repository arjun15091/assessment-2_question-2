package com.godigit.setter_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	Company c =(Company)context.getBean("com");
	System.out.println("college name : " + c.getName());
	System.out.println("college id : " + c.getId());
	System.out.println("college address : " + c.getAddress());
}
}
