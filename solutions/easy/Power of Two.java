// Title: Power of Two
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/power-of-two/

       }
       
       while(n!=1){
        if(n%2!=0){
            return false;

        }
        else{
            n=n/2;
        }
       }
       return true;
    }
}
