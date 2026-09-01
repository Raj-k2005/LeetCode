// Title: 3Sum Closest
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //sort the array 
        Arrays.sort(nums);
        int resum=nums[0]+nums[1]+nums[2];
        int minDiff=Integer.MAX_VALUE;

// Iterate the loop till the length
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;

//check for the target elements both the side
            while(left<right){
                //add the elements of i then left and right
                int sum=nums[i]+nums[left]+nums[right];
