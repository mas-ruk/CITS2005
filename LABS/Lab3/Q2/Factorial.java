import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger computeFactorial(int number) {
        if (number <= 1) {
            return BigInteger.ONE; // base case
        } else {
            return BigInteger.valueOf(number).multiply(computeFactorial(number - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the number you want to find the factorial of");
        int answer = sc.nextInt();
        BigInteger output = computeFactorial(answer);
        System.out.println(output);
    }
}