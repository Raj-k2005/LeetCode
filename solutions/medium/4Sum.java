// Title: 4Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/4sum/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long target2=(long)target-(long)nums[i]-(long)nums[j];
                int left=j+1;
                int right=n-1;
                while(left<right){
                    int s=nums[left]+nums[right];
                    if(s<target2){
                        left++;
                    }
                    else if(s>target2){
