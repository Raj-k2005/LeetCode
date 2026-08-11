// Title: Search Insert Position
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/search-insert-position/

        }
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            mid=left+(right-left)/2;
        while(left<=right){
        int mid;
        int left=0;
        int right=nums.length-1;
class Solution {
    public int searchInsert(int[] nums, int target) {
