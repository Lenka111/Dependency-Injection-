//Elena Voinu

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	
	// used for constructoor injection
	public GolfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public GolfCoach(String s) {
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your putting skills for 2 hours today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
