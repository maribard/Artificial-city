import java.util.Random;

public class RandomGenerator {
	Random generator;
	
	private static RandomGenerator INSTANCE;
	
	private RandomGenerator(){
		generator = new Random();
	}
	
	public static RandomGenerator getInstance(){
		if(INSTANCE == null)
			INSTANCE = new RandomGenerator();
		return INSTANCE;
	}
	
	int probability(){
		return generator.nextInt(1000);
	}
}
