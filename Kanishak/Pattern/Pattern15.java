// Write a program to print the following pattern for n = 4

// ABCD
// ABC
// AB
// A

package Pattern;

public class Pattern15 {
     public void pattern15(int n) {
       for(int i = n; i >= 1; i--){
        for(int j = 1; j<=i; j++){
            char ch = (char)('A'+ (j-1));
            System.out.print(ch + "");
        }
            System.out.println();
       }
    }

    public static void main(String[] args) {
        Pattern15 obj = new Pattern15();
        obj.pattern15(4);   // change value to test
    }
}
