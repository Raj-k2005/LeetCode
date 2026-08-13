// Title: Find First and Last Position of Element in Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

        int start=0;

        int ans=-1;

    startindex){
    int search(int[] nums, int target, boolean 
    }   

        return  ans;

        ans[1]=end;
        ans[0]=start;
        int end=search(nums, target, false);
        int[] ans={-1,-1};
        int start=search(nums, target, true);
class Solution {
    public int[] searchRange(int[] nums, int target) {
