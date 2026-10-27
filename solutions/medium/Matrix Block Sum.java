// Title: Matrix Block Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/matrix-block-sum/

                int endCol = Math.min(n - 1, j + k);

                for (int r = startRow; r <= endRow; r++) {
                int startCol = Math.max(0, j - k);

                int endRow = Math.min(m - 1, i + k);
                int startRow = Math.max(0, i - k);

                int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {


        int[][] answer = new int[m][n];
        int n = mat[0].length;
        int m = mat.length;
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {

