// Write a program to find the GCD of two numbers.
package day24;

public class Q4 {
    // by using Euclidean algorithm
     public int GCD(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
     }

    public static void main(String[] args) {
        Q4 obj = new Q4();
        int n1 = 48; // change value to test
        int n2 = 18; // change value to test
        int result = obj.GCD(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + result);
    }
}
