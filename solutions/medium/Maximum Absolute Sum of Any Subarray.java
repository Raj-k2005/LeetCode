// Title: Maximum Absolute Sum of Any Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        //git code repushhhh
        return Math.max(
            Math.abs(minss(nums)),
            Math.abs(maxss(nums))
        );
    }
    private int minss(int[] nums){
        int t=0;
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            t+=num;
            if(min>t)
                min=t;
            if(t>0)
                t=0; 
        }
        return min;
    }
