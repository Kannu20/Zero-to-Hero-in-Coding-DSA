// Write a program to check if a number is an Armstrong number or not.

// Input: N = 153
// Output: 153 is an Armstrong number: true
// Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
package day25;

public class Q1 {
        public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length(); // Get number of digits
        int sum = 0;
        int n = num;

        while (n > 0) {
            int ld = n % 10;             // Last digit
            sum += Math.pow(ld, k);      // Add ld^k
            n /= 10;                     // Remove digit
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int num = 153; // change value to test
        boolean result = isArmstrong(num);
        System.out.println(num + " is an Armstrong number: " + result);
    }
}
