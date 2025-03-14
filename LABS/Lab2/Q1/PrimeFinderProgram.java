package Q1;
import java.util.Scanner;

public class PrimeFinderProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // grab user input for first number
        System.out.println("Enter the first number");
        String input1 = sc.nextLine();
        
        // convert to int
        int firstNumber = Integer.parseInt(input1);

        // grab user input for second number
        System.out.println("Enter second number");
        String input2 = sc.nextLine(); 
        
        // convert to int
        int secondNumber = Integer.parseInt(input2);
  
        // print result
        System.out.println(PrimeFinder.countPrimes(firstNumber, secondNumber));

        sc.close();
    }
}