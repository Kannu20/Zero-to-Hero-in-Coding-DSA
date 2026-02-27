// Pattern 8: Diamond Pattern

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
package Pattern;

public class Pattern8 {
      public void pattern8(int n) {

        // upper pyramid
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower pyramid
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern8 obj = new Pattern8();
        obj.pattern8(4);   // change value to test
    }
}
