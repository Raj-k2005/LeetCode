// Title: Find All Anagrams in a String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pcount=new int[26];
        int[] scount=new int[26];
        List<Integer> result=new java.util.ArrayList<>();

        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            scount[s.charAt(i)-'a']++;

            if(i>=p.length()){
                scount[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(pcount, scount)){
