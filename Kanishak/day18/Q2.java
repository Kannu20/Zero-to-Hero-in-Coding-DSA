// Decode Ways

// input: s = "226"
// output: 3
// Explanation: "226" can be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
package day18;

import java.util.*;
class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);
        return solve(0, s, dp);
    }

    public int solve(int i, String s, int[]dp) {
        int n = s.length();
        if(i == n) return 1;

        if(s.charAt(i) == '0') return 0;

        if(dp[i] != -1) return dp[i];

        int ways = 0;

        //picking one digit
        ways += solve(i+1, s, dp);

        //picking two digits if feasible
        if(i+1 < n) {
            int num = (s.charAt(i) - '0') * 10 + (s.charAt(i+1) - '0');

            if(num >= 10 && num < 27) {
                ways += solve(i+2,s, dp);
            }
        }

        dp[i] = ways;
        return ways;
    }
}