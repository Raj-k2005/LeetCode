// Title: Permutation in String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/permutation-in-string/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(m<n) return false;
        int map1[]= new int[26];
        int map2[]= new int[26];

        for(int i=0;i<s1.length();i++){
            map1[s1.charAt(i)-'a']++;
            map2[s2.charAt(i)-'a']++;

        }
        if(isMatched(map1, map2)){
            return true;
           }
