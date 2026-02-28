// Write a program to print the following pattern for n = 4

// 1      1
// 12    21
// 123  321
// 12344321

package Pattern;

public class Pattern12 {
    public void pattern12(int n) {
        // left triangle
       for(int i = 1; i<=n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j);
        }
       
       // space
       for(int s = 1; s <= 2*(n-i); s++){
            System.out.print(" ");
        }
        for(int j = i; j >= 1; j--){
            System.out.print(j);
        }
        System.out.println();
       }
    }

    public static void main(String[] args) {
        Pattern12 obj = new Pattern12();
        obj.pattern12(4);   // change value to test
    }
}
