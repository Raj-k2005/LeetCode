// Title: Minimum Length of String After Deleting Similar Ends
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/

class Solution {
    public int minimumLength(String s) {
        //git repush code 
        //apply two pointer approch
        //assign i to fiirst and j to last element
        int n=s.length();
        int i=0,j=n-1;
        //check if the i char is == j char
        while(i<j && s.charAt(i)==s.charAt(j)){
            //take extra variable for subarray char check
            char ch=s.charAt(i);
            //check if i char == i+1 char i++
            while(i<j && s.charAt(i)==ch){
                i++;
            }
            //like wise j char== j-1 and j--
            while(j>=i && s.charAt(j)==ch){
