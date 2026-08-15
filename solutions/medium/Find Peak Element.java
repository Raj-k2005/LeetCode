// Title: Find Peak Element
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-peak-element/

        int end=arr.length-1;

        while(start < end){
            int mid=start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
        int start=0;
class Solution {
    public int findPeakElement(int[] arr) {
