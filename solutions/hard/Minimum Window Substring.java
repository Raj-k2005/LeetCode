// Title: Minimum Window Substring
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-window-substring/

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map=new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int left=0;
        int count=t.length();
        int minLen=Integer.MAX_VALUE;
        String ans="";

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            if(map.containsKey(ch)){
                if(map.get(ch)>0) count--;
                map.put(ch, map.get(ch)-1);
