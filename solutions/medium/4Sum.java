// Title: 4Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/4sum/

class Solution {
    //sort the array first and take a new list to store the 
    elements
    public List<List<Integer>> fourSum(int[] nums, int 
    target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //cheeck for the target element 
                long target2=(long)target-(long)nums[i]-
                (long)nums[j];
                int left=j+1;
                int right=n-1;
