// Write a program to check if a number is a palindrome or not.

package day24;


public class Q3 {
     public boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            n = n / 10; // Remove the last digit
        }
        return original == reversed;
     } // Check if original and reversed are the same
    public static void main(String[] args) {
        Q3 obj = new Q3();
        int n = 12231; // change value to test
        boolean result = obj.isPalindrome(n);
        System.out.println(n + " is a palindrome: " + result);
    }
}
