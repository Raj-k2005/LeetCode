// Title: Find Minimum in Rotated Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

            int mid=left+(right-left)/2;
        }

            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        return nums[left];
    }
}
