package com.some.springone;

public class BaseballCoach implements Coach{

	//create a define a private field for dependency
	private FortuneService fortuneService;

	//create a constructor for dependency

	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWork() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
