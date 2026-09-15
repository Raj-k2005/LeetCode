// Title: Merge Intervals
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/merge-intervals/

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(i ->i[0]));
        List<int[]> result=new ArrayList<>();

        int[] newInterval=intervals[0];
        result.add(newInterval);

        for(int[] interval:intervals){
            if(interval[0]<=newInterval[1]){
               newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
