// Title: Search a 2D Matrix
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int 
    target) {
    int rowIdx=searchRow(matrix, target);
    if(rowIdx !=-1) return bisearchRow(rowIdx, 
    matrix, target);
    else return false; 
    }

    private int searchRow(int[][] matrix, int target)
    {
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(matrix[mid][0]<=target && target <= 
