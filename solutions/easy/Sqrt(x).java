// Title: Sqrt(x)
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/sqrt(x)/

            int mid=left+(right-left)/2;
            long sqrt=(long)mid*mid;
            if(sqrt==x){
                return mid;
            }
            else if(sqrt<x){
                result=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    }
        while(left<=right){

        int result=1;
