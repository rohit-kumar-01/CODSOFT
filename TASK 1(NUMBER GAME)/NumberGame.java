import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int numberOfRounds = 1;
        String playAgain = "yes";

        while (numberOfRounds <= 5 && "yes".equalsIgnoreCase(playAgain)) {
            int randomNumber = rand.nextInt(100) + 1;
            int attempts = 10;

            System.out.println("Round " + numberOfRounds);
            System.out.println("Guess the number between 1 and 100.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();

                if (userGuess < randomNumber) {
                    System.out.println("Nope! The number is higher. Guess again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Nope! The number is lower. Guess again.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                    score++;
                    break;
                }

                attempts--;
            }

            if (attempts == 0) {
                System.out.println("Sorry, you didn't guess the number. The correct number was: " + randomNumber);
            }

            numberOfRounds++;
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        }

        System.out.println("Your final score is: " + score + " out of " + (numberOfRounds - 1));

        sc.close();
    }
}