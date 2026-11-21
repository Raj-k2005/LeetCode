// Title: Spiral Matrix
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/spiral-matrix/


            for(int row=rowMin; row<=rowMax && result.size() < total; row++){
                result.add(matrix[row][colMax]);
                
            }
            colMax--;
            for(int col=colMax; col>=colMin && result.size() < total; col--){
                result.add(matrix[rowMax][col]);
                
            }
            rowMax--;

            for(int row=rowMax;row>=rowMin && result.size() < total; row--){
                result.add(matrix[row][colMin]);
                
            }
            colMin++;
        }
        return result;

