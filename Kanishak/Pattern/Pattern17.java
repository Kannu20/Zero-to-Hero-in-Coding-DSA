// Write a program to print the following pattern for the given N number of rows.

//    A
//   ABA
//  ABCBA
// ABCDCBA

package Pattern;

public class Pattern17 {
    public void pattern17(int n) {
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            // increasing part
            for(int j = 1; j <= i; j++) {
                char ch = (char)('A' + j - 1);
                System.out.print(ch);
            }

            // decreasing part
            for(int j = i - 1; j >= 1; j--) {
                char ch = (char)('A' + j - 1);
                System.out.print(ch);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern17 obj = new Pattern17();
        obj.pattern17(4);   // change value to test
    }
}
