// Title: Spiral Matrix
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int rowMin=0, rowMax=matrix.length-1;
        int colMin=0, colMax=matrix[0].length-1;

        int total=(rowMax + 1) * (colMax + 1);

        while(result.size() < total){
            for(int col=colMin; col<=colMax && result.size()<total; 
            col++){
                result.add(matrix[rowMin][col]);
                
            }
            rowMin++;

            for(int row=rowMin; row<=rowMax && result.size() < total; 
