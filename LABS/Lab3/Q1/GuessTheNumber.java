import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void numberGuess(int target) {
        Scanner sc = new Scanner(System.in);

        int guess = 0;
        while(guess != target) {
            System.out.println("Take a guess!");
            guess = sc.nextInt();
            if (1 <= guess && guess <= 100) {
                if (guess == target) {
                    System.out.println("You're correct! You win!");
                    break;
                } else if (guess < target) {
                    System.out.println("Too low!");
                } else if (guess > target) {
                    System.out.println("Too high!");
                }
            } else {
                System.out.println("Guess must be between 1 and 100!!");
            }
        }
    }
    public static void main(String[] args) {
        // initialising objects required
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        numberGuess(randomNumber);
    }
}