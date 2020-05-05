package com.some.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		//load the spring configuration file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		//call methods on the bean
		System.out.println(myCoach.getDailyWork());
		System.out.println(myCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
