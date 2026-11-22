// Title: Capacity To Ship Packages Within D Days
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        int ans=0;
        while(low<=high){
            int cap=low+(high-low)/2;
            if(canShip(weights,days,cap)){
                ans=cap;
                high=cap-1;
            }
            else{
                low=cap+1;
            }
        }
        return ans;
