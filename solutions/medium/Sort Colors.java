// Title: Sort Colors
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        //here we use 3 pointer approch to solve this kind of problem
        //git repush code 
        int rs=nums.length;
        int n=rs;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                mid++;
                low++;
            }
            else if(nums[mid]==1){mid++;}
            else{
                nums[mid]=nums[high];
