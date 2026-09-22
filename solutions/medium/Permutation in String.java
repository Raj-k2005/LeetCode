// Title: Permutation in String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/permutation-in-string/

           if(isMatched(map1, map2)){
            return true;
           }
        }
        return false;
    }
    private boolean isMatched(int map[], int 
    map2[]){
        for(int i=0;i<26;i++){
            if(map[i]!=map2[i]) return false;
        }
        return true;
    }
}
