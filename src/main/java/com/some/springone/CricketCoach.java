package com.some.springone;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;
    FortuneService fortuneService;

    //create a no-arg constructor
    public CricketCoach(){
        System.out.println("CricketCoach: no-arg constructor");
    }

    @Override
    public String getDailyWork() {
        return "Practice fast bowling for 15 mins.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Calling setter method for fortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: Calling setter method for EmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: Calling setter method for Team");
        this.team = team;
    }
}
