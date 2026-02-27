// Reach a number

// Input: target = 2
// Output: 3
// Explanation:
// On the 1st move, we step from 0 to 1 (1 step).
// On the 2nd move, we step from 1 to -1 (2 steps).
// On the 3rd move, we step from -1 to 2 (3 steps).

class Solution {
    public int reachNumber(int target) {
        int sum = 0;
        int steps = 0;

        target = Math.abs(target);

        while(sum < target){
            sum += steps;
            steps++;
        }
        while((sum-target) % 2 == 1){
            sum += steps;
            steps++;
        }
        return steps-1;
    }
}