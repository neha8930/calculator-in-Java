import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerRange = 1;
        int upperRange = 100;
        int maxAttempts = 5;
        int rounds = 0;
        int totalAttempts = 0;
        int bestScore = maxAttempts + 1;  // Initialize with a value higher than possible attempts

        while (true) {
            rounds++;
            System.out.println("\nRound " + rounds);
            int targetNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
            System.out.println("Guess a number between " + lowerRange + " and " + upperRange + ".");

            int attempts = 0;
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low!");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
                    if (attempts < bestScore) {
                        bestScore = attempts;
                    }
                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("\nGame Over");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Total attempts made: " + totalAttempts);
        System.out.println("Best score: " + (bestScore == maxAttempts + 1 ? "N/A" : bestScore + " attempts"));

        scanner.close();
    }
    }






