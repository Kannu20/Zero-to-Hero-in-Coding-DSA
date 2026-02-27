// Pattern 20: Hollow Square Pattern


// *****
// *   *
// *   *
// *   *
// *****

package Pattern;

public class Pattern20 {
    public void pattern(int n) {

        for (int i = 1; i <= n; i++) {          // rows
            for (int j = 1; j <= n; j++) {      // columns

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Pattern20 obj = new Pattern20();
        obj.pattern(4);   // change value to test

    }
}
