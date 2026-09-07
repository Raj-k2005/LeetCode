// Title: Valid Sudoku
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/valid-sudoku/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows=new int[9][9];
        int[][] col=new int[9][9];
        int[][] boxes=new int[9][9];

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                int val=board[r][c]-'1';
                if(rows[r][val]==1){
                    return false;
                }
                rows[r][val]=1;
