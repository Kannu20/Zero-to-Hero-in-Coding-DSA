// Finding Pairs With a Certain Sum

// Input
// ["FindSumPairs", "count", "add", "count", "count", "add", "add", "count"]
// [[[1, 1, 2, 2, 2, 3], [1, 4, 5, 2, 5, 4]], [7], [3, 2], [8], [4], [0, 1], [1, 1], [7]]
// Output
// [null, 8, null, 2, 1, null, null, 11]

// Explanation
// FindSumPairs findSumPairs = new FindSumPairs([1, 1, 2, 2, 2, 3], [1, 4, 5, 2, 5, 4]);
// findSumPairs.count(7);  // return 8; pairs (2,2), (3,2), (4,2), (2,4), (3,4), (4,4) make 2 + 5 and pairs (5,1), (5,5) make 3 + 4
// findSumPairs.add(3, 2); // now nums2 = [1,4,5,4,5,4]
// findSumPairs.count(8);  // return 2; pairs (5,2), (5,4) make 3 + 5
// findSumPairs.count(4);  // return 1; pair (5,0) makes 3 + 1
// findSumPairs.add(0, 1); // now nums2 = [2,4,5,4,5,4]
// findSumPairs.add(1, 1); // now nums2 = [2,5,5,4,5,4]
// findSumPairs.count(7);  // return 11; pairs (2,1), (2,2), (2,4), (3,1), (3,2), (3,4), (4,1), (4,2), (4,4) make 2 + 5 and pairs (5,3), (5,5) make 3 + 4
package day12;


import java.util.*;
class FindSumPairs {

    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> freq;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        freq = new HashMap<>();
        for (int num : nums2) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];

        freq.put(oldVal, freq.get(oldVal) - 1);
        if (freq.get(oldVal) == 0) {
            freq.remove(oldVal);
        }

        nums2[index] += val;
        freq.put(nums2[index], freq.getOrDefault(nums2[index], 0) + 1);
    }
    
    public int count(int tot) {
        int result = 0;

        for (int num : nums1) {
            int target = tot - num;
            result += freq.getOrDefault(target, 0);
        }

        return result;

    }
}