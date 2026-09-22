// Title: Palindrome Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/palindrome-number/

class Solution{
public static boolean isPalindrome(int num) {
    int original = num;
    int reversed = 0;
//reverse the numbers first then check if the reversed and 
original values are same if yes then return true
    while (num > 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    return original == reversed;
}

}
