// Pattern 10: Half Diamond Star Pattern


// *
// **
// ***
// ****
// ***
// **
// *

package Pattern;

public class Pattern10 {
    public void pattern10(int n) {
        // Upper triangle
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower triangle
        for(int i = n-1; i >=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern10 obj = new Pattern10();
        obj.pattern10(4);   // change value to test
    }
}
