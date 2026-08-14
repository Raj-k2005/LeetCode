// Title: Search Insert Position
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/search-insert-position/

            mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        while(left<=right){
        int right=nums.length-1;
        int left=0;
        int mid;
    public int searchInsert(int[] nums, int target) {
class Solution {
