// Fibonacci series using recursion
package day20;

public class Q3 {
    public int fib(int n) {
       // base case
        if( n == 0) return 0;
        if( n == 1) return 1;

        // recursive call
        return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args){
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + new Q3().fib(n));
    }
}
