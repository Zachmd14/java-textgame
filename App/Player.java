import java.util.Random;

public class Player {

	static Random rand = new Random();

	static int damages;

	public Player() {
	}

	public void setRandomDamages() {

		int n = rand.nextInt(150);
		damages = n;

		// DEBUGGING
		System.out.println("DEBUGGING random number is : " + n);

	}
}
