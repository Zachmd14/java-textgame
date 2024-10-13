import java.util.Scanner;

public class App {

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Initialize the 'Player' class
		Player Hero = new Player();

		System.out.println("\n===== WELCOME TO JAVA TEXT GAME =====\n");

		System.out.println("MENU :");
		System.out.println("'Still in Development' : 1 - New Hero");
		System.out.println("2 - New Adventure with Random Hero");

		System.out.println("\nEnter Valid Menu Number : ");

		// DEBUGGING
		Hero.setRandomDamages();
	}
}
