// Write a program to reverse the digits of a given integer N.

// Input: N = 12345
// Output: 54321
package day24;

public class Q2 {
    public int reverseNumber(int n) {
        int k = 0;
        while(n > 0){
            k = k * 10 + n % 10;
            n = n / 10;
        }
        return k;
    }

    public static void main(String[] args) {
        Q2 obj = new Q2();
        int n = 12345; // change value to test
        int result = obj.reverseNumber(n);
        System.out.println("Reverse of " + n + " is: " + result);
    }
}
