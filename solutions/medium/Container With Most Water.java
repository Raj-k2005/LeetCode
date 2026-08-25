// Title: Container With Most Water
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int p1=0;
        int p2=height.length-1;
        int maxwater=0;

        while(p1<p2){
            if(height[p1]<=height[p2]){
                maxwater=Math.max(maxwater, (height[p1]*
                (p2-p1)));
                p1++;
            }
            else{
                maxwater=Math.max(maxwater,(height[p2]*
                (p2-p1)));
                p2--;
            }
