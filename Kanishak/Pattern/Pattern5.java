// Pattern 5: Inverted Right-Angled Triangle Pattern

package Pattern;

// *****

// ****

// ***

// **

// *

public class Pattern5 {
    public void pattern5(int n) {
       for(int row = n; row > 0; row--){
            for(int col = 0; col < row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
