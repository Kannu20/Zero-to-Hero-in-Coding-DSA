// Pattern 2: Right-Angled Triangle Pattern

// *
// **
// ***
// ****

package Pattern;

public class Pattern2 {
     public void pattern2(int n) {
        for(int row = 0; row < n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 obj = new Pattern2();
        obj.pattern2(4);   // change value to test
    }
}
