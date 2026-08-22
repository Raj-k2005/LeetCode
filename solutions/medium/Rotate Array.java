// Title: Rotate Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/rotate-array/

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        return ;
    }
    
    public static void reverse(int[] nums, int  start, 
    int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
        int n=nums.length;
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%n;
