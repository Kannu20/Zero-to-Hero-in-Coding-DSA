// Pattern 9: Inverted Pyramid Pattern

// *********
//  *******
//   *****
//    ***
//     *

package Pattern;

public class Pattern9 {
    public void pattern9(int n) {
      for(int i = 0; i < n; i++){
        for(int spaces = 0; spaces < i; spaces++){
            System.out.print(" ");
        }
        for(int j = 0; j < 2*(n-i) - 1; j++){
            System.out.print("*");
        }
        System.out.println();
      }
    }

    public static void main(String[] args) {
        Pattern9 obj = new Pattern9();
        obj.pattern9(4);   // change value to test
    }
}
