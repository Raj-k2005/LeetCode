// Title: Richest Customer Wealth
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/richest-customer-wealth/

        int ans = 0;

        for (int[] person : accounts) {
            int sum = 0;

            for (int money : person) {
                sum += money;
            }

            ans = Math.max(ans, sum);
        }

        return ans;
    }
    public int maximumWealth(int[][] accounts) {
class Solution {

