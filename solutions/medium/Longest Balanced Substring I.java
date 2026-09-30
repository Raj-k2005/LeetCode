// Title: Longest Balanced Substring I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-balanced-substring-i/

class Solution {
       public static boolean checkBalance(int[] freq){
        //git repush code ,msdf kjgsjkbgskjlbgkljbksjbdksbds
        //using frequency checking method to solve the problem
        int common=0;
            for(int i=0;i<26;i++){
                if(freq[i]==0) continue;
                if(common ==0){common = freq[i];}
                else if(freq[i]!=common){return false;}
            }
            return true;
        }
    public int longestBalanced(String s) {
        int rs=s.length();
        int n=rs;
        int maxL=0;
        for(int i=0;i<n;i++){
