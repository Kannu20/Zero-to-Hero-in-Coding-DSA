// Print numbers from n to 1 using recursion
// Input: n = 10
// Output: 10 9 8 7 6 5 4 3 2 1
package day25;

public class Q3 {
    class Solution {
    public void printNumbers(int n) {
        // Your code goes here
        // from N to 1
        if (n == 0) return;      // base case
        System.out.println(n);   // print before call
        printNumbers(n - 1);     // recursive call    
    }
}
  
    public static void main(String[] args) {
        int n = 10; // change value to test
        Solution solution = new Q3().new Solution();
        solution.printNumbers(n);
    }
}
