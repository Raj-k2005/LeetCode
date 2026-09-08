// Title: Find the Difference
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
        int total=0;
        //finding sky value by making sum of all letters
        for(int i=0;i<t.length();i++){
             total=total+t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            total=total-s.charAt(i);
        }
        return (char) total;
    }
}
