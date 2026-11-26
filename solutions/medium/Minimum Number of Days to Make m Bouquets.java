// Title: Minimum Number of Days to Make m Bouquets
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

            if(bloom<=day){
                count++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
            }
                else{
                    count=0;
                }
            }
            
        
        return bouquets>=m;
    }
}
