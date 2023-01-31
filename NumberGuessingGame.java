import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1; // generate a random number from 1 to 100
        int guess = -1;
        int attempts = 0;
        int score = 100;

        while (guess != target) {
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("Too high");
            } else if (guess < target) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You took " + attempts + " attempts");
                score -= attempts;
                System.out.println("Your score is: " + score);
            }

            if (attempts >= 10) {
                System.out.println("Too many attempts! The target was " + target);
                break;
            }
        }
    }
}
