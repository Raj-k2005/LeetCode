// Title: Merge Sorted Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int 
    n) {
//non optimized and o(n log n) time commplexity 
    // // Copy nums2 into nums1
    for (int i = 0; i < n; i++) {
        nums1[m + i] = nums2[i];
    }

    // Sort the complete nums1 array
    Arrays.sort(nums1);

//optimized solution
// int i=m-1;
// int j=n-1;
// int k=m+n-1;
