// Title: Single Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int value=0;
        for(int i=0;i<nums.length;i++){
            value=value^nums[i];
        }
        return value;
    }
}
