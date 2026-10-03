// Title: Maximum Average Subarray I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int winSum = 0;

        for (int i = 0; i < k; i++) {
            winSum += nums[i];
        }

        int maxAns = winSum;

        for (int j = k; j < nums.length; j++) {
            winSum += nums[j];
            winSum -= nums[j - k];

            maxAns = Math.max(maxAns, winSum);
        }

