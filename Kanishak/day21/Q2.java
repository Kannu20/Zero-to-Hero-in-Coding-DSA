// Find All Duplicates in an Array

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]
package day21;

// Cyclic Sort Approach

// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//             int i = 0;
//             while (i < nums.length) {
//             int correct = nums[i] - 1;

//             if (nums[i] != nums[correct]) {
//                 swap(nums, i, correct);
//             } else {
//                 i++;
//             }
//         }
//         List<Integer> ans = new ArrayList<>();
//         for (i = 0; i < nums.length; i++) {
//             if (nums[i] != i + 1) {
//                 ans.add(nums[i]);
//             }
//         }
//         return ans;
//     }

//     public static void swap(int arr[], int first, int second){
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }
// }

// Negative marking approach

import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                ans.add(index + 1);   
            } else {
                nums[index] = -nums[index];
            }
        }
        return ans;
    }
}
