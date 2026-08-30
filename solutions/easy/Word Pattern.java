// Title: Word Pattern
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/word-pattern/

class Solution {
    public boolean wordPattern(String pattern, String 
    s) {
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> hm=new 
        HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
             char ch=pattern.charAt(i);
             boolean containsKey=hm.containsKey(ch);
             if(hm.containsValue(arr[i]) && 
             !containsKey){
                return false;
             }
