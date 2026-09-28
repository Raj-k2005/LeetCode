// Title: Two Sum
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //two pointer approch doesnt work here becoz array 
        isnt sorted and cant chnage the original array to 
        use hashmap approch...
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("no match");
    }
}
