package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/app.xml");
		Employee e = (Employee) ctx.getBean("e");
		Employee e1 = (Employee) ctx.getBean("e");
		System.out.println(e.getId() + " " + e.getName() + " " + e.getAdr().getState() + " " + e.getAdr().getCity());
	}
}
