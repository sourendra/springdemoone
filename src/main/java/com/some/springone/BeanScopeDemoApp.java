package com.some.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load the Spring config file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //get bean from context
        Coach coachOne = applicationContext.getBean("myCoach", Coach.class);

        Coach coachTwo = applicationContext.getBean("myCoach", Coach.class);

        //if they are same bean
        System.out.println(coachOne == coachTwo);
        System.out.println("Memory location for coachOne: "+coachOne);
        System.out.println("Memory location for coachTwo: "+coachTwo);
        applicationContext.close();
    }
}
