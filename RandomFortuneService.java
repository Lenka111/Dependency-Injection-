
//Elena Voinu
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of fortune messages
	private String[] data = { 
			"Today is your lucky day",
			"you look hungry",
			"Don't worry, be happy"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		//random message 
		String theFortune = data[index];
		
		return theFortune;
	}

}


