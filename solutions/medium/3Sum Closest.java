// Title: 3Sum Closest
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resum=nums[0]+nums[1]+nums[2];
        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==target){
                    return target;
                }
