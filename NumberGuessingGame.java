import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumber = 100;
        int maxAttempts = 5;
        int totalRounds = 3;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + maxAttempts + " attempts to guess a number between 1 and " + maxNumber + ".");
        System.out.println("Let's start!\n");

        for (int round = 1; round <= totalRounds; round++) {
            int targetNumber = random.nextInt(maxNumber) + 1;
            System.out.println("Round " + round);

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess == targetNumber) {
                    int roundPoints = maxAttempts - attempt + 1;
                    score += roundPoints;
                    System.out.println("Congratulations! You guessed the number correctly.");
                    System.out.println("Round Score: " + roundPoints);
                    System.out.println("Total Score: " + score);
                    break;
                } else {
                    if (guess < targetNumber) {
                        System.out.println("Too low!");
                    } else {
                        System.out.println("Too high!");
                    }
                }

                if (attempt == maxAttempts) {
                    System.out.println("You've run out of attempts.");
                    System.out.println("The correct number was: " + targetNumber);
                }
            }

            System.out.println();
        }

        System.out.println("Game Over!");
        System.out.println("Final Score: " + score);
    }
}