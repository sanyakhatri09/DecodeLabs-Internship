import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate random number 1-100
        int secretNumber = random.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;


        System.out.println("===== NUMBER GAME =====");
        System.out.println("I have selected a number between 1 and 100");
        System.out.println("Try to guess it!");


        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            attempts++;


            if (guess > secretNumber) {

                System.out.println("Too High! Try again.");

            } 
            else if (guess < secretNumber) {

                System.out.println("Too Low! Try again.");

            } 
            else {

                System.out.println("Correct! You guessed the number.");

                System.out.println("Attempts: " + attempts);

            }
        }


        input.close();

    }
}