// Write a program to print the following pattern for n = 4

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
package Pattern;

public class Pattern11 {
     public void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                int val = 1 - ((i + j) % 2);
                System.out.print(val + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern11 obj = new Pattern11();
        obj.pattern11(4); 
    }  // change value to test
}
