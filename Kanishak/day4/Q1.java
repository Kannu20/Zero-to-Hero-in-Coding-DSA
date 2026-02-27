package day4;

// Two Sum II - Input Array Is Sorted

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            if(nums[i] + nums[j] < target){
                i++;
            }else if(nums[i] + nums[j] > target){
                j--;
            }else{
                return new int[]{i+1, j+1};
            }
        }
        return null;
    }
}