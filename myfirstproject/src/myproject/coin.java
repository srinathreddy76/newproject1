package myproject;
import java.util.Scanner;
import java.util.Random;
public class coin {
	public static void main(String[] strings) {

	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter 0 for heads or 1 for tails: ");
	    int userGuess = input.nextInt();

	    input.close();

	    System.out.println("Flipping coin...");

	    int coinSide = new Random().nextInt(2);

	    if (userGuess == coinSide) {
	        System.out.println("Good job! You guess is correct.");
	    } else if (coinSide == 0) {
	        System.out.println("Sorry, it is a heads");
	    } else {
	        System.out.println("Sorry, it is a tails");
	    }
	}

}
