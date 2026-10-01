// Title: Trapping Rain Water
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;

        int water=0;

        int left_max=height[left];
        int right_max=height[right];

        while(left<right){
            if(left_max < right_max){
                left++;
                left_max=Math.max(left_max, 
                height[left]);
                water+=left_max-height[left];
            }
