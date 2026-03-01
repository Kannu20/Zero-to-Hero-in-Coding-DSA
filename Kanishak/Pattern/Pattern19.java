// Write a program to print the following pattern for the given N number of rows.

// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********


package Pattern;

public class Pattern19 {
     public void pattern19(int n) {
         // Upper half
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern19 obj = new Pattern19();
        obj.pattern19(4);   // change value to test
    }
}
