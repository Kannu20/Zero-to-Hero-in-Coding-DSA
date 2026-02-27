package day4;

// Moves Zeros

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]


class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                swap(nums, i, j);
                i++;
            }
        }
    }
    public void swap(int[] arr, int i, int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }
}