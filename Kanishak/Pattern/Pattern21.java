// Pattern 21: Concentric Square Pattern

// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4
package Pattern;
public class Pattern21 {

    public void pattern22(int n) {

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pattern21().pattern22(4);
    }
}