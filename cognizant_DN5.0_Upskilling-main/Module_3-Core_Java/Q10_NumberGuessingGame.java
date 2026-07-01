import java.util.Random;
import java.util.Scanner;

public class Q10_NumberGuessingGame {
    public static void main(String[] args) {
        int target = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess, attempts = 0;
        System.out.println("Guess the number (1-100):");
        do {
            guess = sc.nextInt();
            attempts++;
            if (guess < target) System.out.println("Too low!");
            else if (guess > target) System.out.println("Too high!");
            else System.out.println("Correct! Attempts: " + attempts);
        } while (guess != target);
    }
}
