// Title: Find All Duplicates in an Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int cor=nums[i]-1;
            if(nums[i]!=nums[cor]){
                swap(nums, i, cor);
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
