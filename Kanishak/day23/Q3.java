// Reverse an array using recursion
// Input: arr = [1, 2, 3, 4, 5]
// Output: Reversed array: 5 4 3 2 1
package day23;

public class Q3 {
    public void reverseArray(int[] arr) {
        reverse(arr, 0, arr.length - 1);
    }
    public void reverse(int[] arr, int i, int j) {
      // base case
        if (i >= j) return;

        // swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // recursive call
        reverse(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        int[] arr = {1, 2, 3, 4, 5}; // change values to test
        obj.reverseArray(arr);
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
