package com.godigit.ConstructorBasedApplication;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	College c =(College)context.getBean("college");
	System.out.println("college name : " + c.getName());
	System.out.println("college id : " + c.getId());
	System.out.println("college address : " + c.getAddress());
}
}
