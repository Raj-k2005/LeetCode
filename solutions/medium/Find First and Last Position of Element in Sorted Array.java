// Title: Find First and Last Position of Element in Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;

            }else if(target>nums[mid]){
                start=mid+1;
            }else{
               ans=mid;
                if(startindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
        
