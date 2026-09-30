// Title: Move Zeroes
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/move-zeroes/

        int n=nums.length;
        int left=0;
        for(int right=0;right<n;right++){
            if(nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }

    }
}
