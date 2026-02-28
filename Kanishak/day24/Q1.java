package day24;

public class Q1 {
    public int countDigit(int n) {
       int l = String.valueOf(n).length();
       for(int i = 0; i <= l; i++){
        // System.out.print(l);
       }
       return l;
    }

    public static void main(String[] args) {
        Q1 obj = new Q1();
        int n = 12345; // change value to test
        int result = obj.countDigit(n);
        System.out.println("\nNumber of digits in " + n + " is: " + result);
    }
}
