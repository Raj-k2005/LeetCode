// Title: Find Minimum in Rotated Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

            int mid=left+(right-left)/2;

            // if(nums[mid]>nums[right]){
            //     left=mid+1;
            // }
            // else{
            //     right=mid;
            // }
            if(nums[mid]<=nums[right]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return nums[left];
    }
}
