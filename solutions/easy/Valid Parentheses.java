// Title: Valid Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
//need to do again
        Stack<Character> stack = new Stack<>
        ();

        for (char c : s.toCharArray()) {

            // Opening brackets → push
            if (c == '(' || c == '{' || c == 
            '[') {
                stack.push(c);
            }

            // Closing brackets → check top
