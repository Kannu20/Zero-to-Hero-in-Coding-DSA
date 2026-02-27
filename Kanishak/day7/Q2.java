// Find the Duplicate Number

// Input: nums = [1,3,4,2,2]
// Output: 2
package day7;

class Solution {
    public int findDuplicate(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);

            if (nums[index] < 0) {
                return index;
            }

            nums[index] = -nums[index];
        }
        return -1;
    }
}