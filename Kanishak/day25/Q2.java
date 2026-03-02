// Print numbers from 1 to n using recursion
// Input: n = 10
// Output: 1 2 3 4 5 6 7 8 9 10

package day25;

public class Q2 {
    class Solution {
    public void printNumbers(int n) {
        // by recursion
        if (n == 0) return;      // base case

        printNumbers(n - 1);     // recursive call
        System.out.println(n);   // print after call
    }
}

    public static void main(String[] args) {
        int n = 10; // change value to test
        Solution solution = new Q2().new Solution();
        solution.printNumbers(n);
    }
}
