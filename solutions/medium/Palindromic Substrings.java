// Title: Palindromic Substrings
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/palindromic-substrings/

class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;

        for(int i=0;i<n;i++){
            count+=expand(s, i, i);
            count+=expand(s, i, i+1);
        }
        return count;
    }
    private int expand(String s, int left, int right){
        int count=0;

        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
        {
            count++;
