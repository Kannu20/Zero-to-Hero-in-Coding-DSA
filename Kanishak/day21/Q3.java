package day21;

public class Q3 {
    public boolean palindromeCheck(String s, int i, int j) {
        //your code goes here
        // base case
        if (i >= j) return true;

        // mismatch
        if (s.charAt(i) != s.charAt(j)) return false;

        // recursive call
        return palindromeCheck(s, i + 1, j - 1);

    }
}
