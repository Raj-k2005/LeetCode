// Title: Matrix Block Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/matrix-block-sum/


class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        //code git repush
        int m = mat.length;
        int n = mat[0].length;

        int[][] answer = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int sum = 0;

                int startRow = Math.max(0, i - k);
                int endRow = Math.min(m - 1, i + k);

                int startCol = Math.max(0, j - k);
                int endCol = Math.min(n - 1, j + k);

