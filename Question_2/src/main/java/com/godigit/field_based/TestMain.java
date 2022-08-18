package com.godigit.field_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Movie m = (Movie)context.getBean("check");
	System.out.println("movie name : " + m.getMovieName());
	System.out.println(m.getA());
}
}
