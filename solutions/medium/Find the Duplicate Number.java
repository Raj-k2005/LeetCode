// Title: Find the Duplicate Number
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
              return nums[i];
            }
            } 
            else
            {
                i++;
            } 
    }
