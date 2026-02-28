// Write a program to print the following pattern for n = 4

// A
// AB
// ABC
// ABCD

package Pattern;

public class Pattern14 {
    public void pattern14(int n) {
       for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){

            char ch = (char)('A'+(j-1));
            System.out.print(ch + ""); 
        }
        System.out.println();
       }
    }

    public static void main(String[] args) {
        Pattern14 obj = new Pattern14();
        obj.pattern14(4);   // change value to test
    }
}
