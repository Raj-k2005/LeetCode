// Title: Find First and Last Position of Element in Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums, target, true);
        int end=search(nums, target, false);
        ans[0]=start;
        ans[1]=end;

        return  ans;

    }   
    int search(int[] nums, int target, boolean startindex){

        int ans=-1;

        int start=0;
        int end=nums.length-1;
