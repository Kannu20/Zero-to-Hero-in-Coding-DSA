// Pattern 6: Inverted Number Triangle Pattern

// 1234
// 123
// 12
// 1
package Pattern;

public class Pattern6 {
      public void pattern6(int n) {
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern6 obj = new Pattern6();
        obj.pattern6(4);   // change value to test
    }
}
