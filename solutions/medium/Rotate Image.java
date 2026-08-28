// Title: Rotate Image
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
//each row reverse
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
