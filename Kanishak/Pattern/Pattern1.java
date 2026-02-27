// Pattern 1: Solid Square Pattern


// *****
// *****
// *****
// *****
// *****

package Pattern;

public class Pattern1 {
     public void pattern1(int n) {
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern1 obj = new Pattern1();
        obj.pattern1(4);   // change value to test
    }
}
