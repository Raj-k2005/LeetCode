// Title: Two Sum II - Input Array Is Sorted
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/two-sum-ii---input-array-is-sorted/

class Solution {
    //apply binary search on the sorted array to reduce the 
    time complexity
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;

        while(left<right){
            int sum=numbers[left]+numbers[right];

            if(sum==target){
                return new int[]{left+1, right+1};
            }
            else if (sum<target){
                left++;
