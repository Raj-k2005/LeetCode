// Title: Minimum Speed to Arrive on Time
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-speed-to-arrive-on-time/

class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1,high=(int) 1e7;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(canReach(dist, hour, mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean canReach(int[] dist, double hour, int speed){
        double time=0.0;

