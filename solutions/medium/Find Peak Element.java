// Title: Find Peak Element
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-peak-element/


        while(start < end){
            int mid=start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
        int end=arr.length-1;
