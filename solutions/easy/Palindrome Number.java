// Title: Palindrome Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/palindrome-number/

class Solution{
public static boolean isPalindrome(int num) {
    int original = num;
    int reversed = 0;

    while (num > 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    return original == reversed;
}

}
