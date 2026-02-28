// Write a program to print the following pattern for n = 4

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
package Pattern;

public class Pattern13 {
     public void pattern13(int n) {
        int num = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern13 obj = new Pattern13();
        obj.pattern13(4);   // change value to test
    }
}
