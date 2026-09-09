// Title: Reverse Vowels of a String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int start=0;
        int end=s.length()-1;

        while(start<end){
            if(!isVowel(ch[start]))
            {
                start++;
            }
            else if(!isVowel(ch[end])){
                end--;
            }
            else{
