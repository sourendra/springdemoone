package com.some.springone;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
	}

	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It! "+fortuneService.getFortune();
	}

	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside init method doMyStartupStuff");
	}

	public void doMyCleanupStuff(){
		System.out.println("TrackCoach: inside init method doMyCleanupStuff");
	}

}
