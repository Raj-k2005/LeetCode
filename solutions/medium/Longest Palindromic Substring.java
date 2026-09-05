// Title: Longest Palindromic Substring
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String LPS="";

        for(int i=1;i<s.length();i++){
            int low=i;
            int high=i;

            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;

                if(low==-1||high==s.length()) break;
            }

