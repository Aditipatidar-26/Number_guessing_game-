import java.util.Scanner;
import java.lang.Math;

public class NumberGuessingGame {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int guesses = 0;
		int k, guess = 0;
		boolean correct= false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 1 to 100");
		System.out
				.println("Enter a number of chances you want to guess the number");
		k = sc.nextInt();
		System.out.println("You have " + k + " tries to guess the number");
		while (k > 0) {
			guess = sc.nextInt();
			if (guess < 1 || guess > 100) {
				System.out.println("Please enter valid number!");
			} else {
				guesses += 1;
				if (guess == answer) {
					System.out
							.println("You guess the right number!\n You win!");
					System.out.println("You guess the number in " + guesses + " tries.");
					correct = true;
				} else if (guess < answer) {
					System.out.println("Your guess is too low.");

				} else {
					System.out.println("Your guess is too high.");
				}
			}
			k--;
		}
		if(!correct){
			System.out.println("you are out of guesses.\n You lose!");
			System.out.println("Number was: " + answer);
		}
	}
}
