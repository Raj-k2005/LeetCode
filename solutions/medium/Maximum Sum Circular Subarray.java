// Title: Maximum Sum Circular Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-sum-circular-subarray/

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax=0;
        int maxSum=Integer.MIN_VALUE;

        int curMin=0;
        int minSum=Integer.MAX_VALUE;

        int totalSum=0;

        for(int num:nums){
            curMax=Math.max(num, curMax+num);
            maxSum=Math.max(curMax, maxSum);

            curMin=Math.min(num, curMin+num);
            minSum=Math.min(curMin, minSum);

            totalSum+=num;
        }
        if(maxSum<0){
