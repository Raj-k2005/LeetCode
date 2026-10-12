// Title: Find Pivot Index
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        int leftsum=0;

        for(int i=0;i<nums.length;i++){
            int rightsum=totalsum-leftsum-nums[i];

            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
