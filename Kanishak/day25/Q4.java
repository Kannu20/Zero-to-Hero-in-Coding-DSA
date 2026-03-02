package day25;

public class Q4 {
    public static int sumOfNumbers(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        int n = 10; // change value to test
        int result = sumOfNumbers(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + result);
    }
}
