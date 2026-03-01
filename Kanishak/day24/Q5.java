// Write a program to check if a number is prime or not.

// Input: N = 29
// Output: 29 is a prime number: true
package day24;


public class Q5 {
    public boolean isPrime(int n) {
        //your code goes here

        int cnt = 0;  // Initialize a counter variable to count the number of factors

        // Loop through numbers from 1 to the square root of n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;  // If n is divisible by i, increment the counter

                // If n is not a perfect square, count its reciprocal factor
                if (n / i != i) {
                    cnt++;
                }
            }
        }

        // If the number of factors is exactly 2 (1 and the number itself), it's prime
        return cnt == 2;
    }

    public static void main(String[] args) {
        Q5 obj = new Q5();
        int n = 29; // change value to test
        boolean result = obj.isPrime(n);
        System.out.println(n + " is a prime number: " + result);
    }
}
