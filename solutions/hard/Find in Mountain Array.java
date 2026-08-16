// Title: Find in Mountain Array
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/find-in-mountain-array/

class Solution {

    public int findInMountainArray(int target, MountainArray 
    mountainArr) {
        
        int peak = peakIndexInMountainArray(mountainArr);

        int firstTry = orderAgnostic(mountainArr, target, 0, 
        peak);

        if (firstTry != -1) {
            return firstTry;
        }

        return orderAgnostic(
            mountainArr,
            target,
