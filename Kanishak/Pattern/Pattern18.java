// Write a program to print the following pattern for the given N number of rows.

// D 
// C D
// B C D
// A B C D
package Pattern;

public class Pattern18 {
     public void pattern18(int n) {
     for(int i = 1; i <= n; i++) {

            char start = (char)('A' + (n - i));

            for(char ch = start; ch <= 'A' + (n - 1); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern18 obj = new Pattern18();
        obj.pattern18(4);   // change value to test
    }
}
