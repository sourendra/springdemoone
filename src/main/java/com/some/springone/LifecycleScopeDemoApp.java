package com.some.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleScopeDemoApp {

    public static void main(String[] args) {
        //load config file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        //get the bean from container
        Coach coach = applicationContext.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWork());
        //close the context
        applicationContext.close();
    }
}
