package Q1;
public class PrimeFinder {
    public static boolean isPrime(int n) {
            // edge cases for 1 and 0
            if (n == 1 || n == 0) {
                return false; // 0 and 1 are not prime numbers
            }
            // run a for loop to check if it has any integer divisors
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            // if doesn't catch in the for-loop it is a prime number
            return true;
        }
        
        public static int countPrimes(int start, int end) {
            int count = 0;
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}