// Title: Find Smallest Letter Greater Than Target
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

        while(start<=end){
            int mid=start+(end-start);

            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            } 
        }
        return letters[start%letters.length];
    }
}
