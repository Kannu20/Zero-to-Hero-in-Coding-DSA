// Write a program to print the following pattern for the given N number of rows.

// A
// BB
// CCC
// DDDD

package Pattern;

public class Pattern16 {
    public void pattern16(int n) {
        for(int i = 1; i <= n; i++){  
            for(int j = 1; j <= i; j++){
                char ch = (char)('A'+(i-1));
                System.out.print(ch + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern16 obj = new Pattern16();
        obj.pattern16(4);   // change value to test
    }
}
