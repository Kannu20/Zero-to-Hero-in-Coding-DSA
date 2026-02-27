// Pattern 4: Number Triangle Pattern
package Pattern;

// 1
// 22
// 333
// 4444
public class Pattern4 {
     public void pattern4(int n) {
        for(int i = 1; i <= n; i++){  
            for(int j = 1; j <= i; j++){
                System.out.print(i + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern4 obj = new Pattern4();
        obj.pattern4(4);   // change value to test
    }
}
