package com.some.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach cricketCoach = applicationContext.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWork());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());
        applicationContext.close();
    }
}
