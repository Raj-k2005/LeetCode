// Title: Reverse String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-string/

class Solution {
    static void swap(char[] s, int left,int right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
    }
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;

        while(left<right){
            swap(s, left, right);
            left++;
            right--;
        }
    }
}
