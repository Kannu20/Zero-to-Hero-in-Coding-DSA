// Pattern 7: Pyramid Pattern

//    *
//   ***
//  *****
// *******

package Pattern;

public class Pattern7 {
     public void pattern7(int n) {
       for(int i = 0; i < n; i++){
          for(int space = 0; space < n - i - 1; space++){
                System.out.print(" ");
            }
           for(int j = 0; j < 2*i + 1; j++){
               System.out.print("*");
            } 
        System.out.println();
       }
    }

    public static void main(String[] args) {
        Pattern7 obj = new Pattern7();
        obj.pattern7(4);   // change value to test
    }
}
