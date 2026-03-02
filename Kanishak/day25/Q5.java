// Calculate the factorial of a number using recursion
// Input: n = 5
// Output: Factorial of 5 is: 120

package day25;

public class Q5 {
    class Solution {
    public int factorial(int n) {
        if(n == 0){
            return 1;
        }
       return n * factorial(n - 1);
    }
}

    public static void main(String[] args) {
        int n = 5; // change value to test
        Solution solution = new Q5().new Solution();
        int result = solution.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
