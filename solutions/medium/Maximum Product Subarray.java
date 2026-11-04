// Title: Maximum Product Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-product-subarray/

        int ans=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix*=nums[i];
            suffix*=nums[n-1-i];

            ans=Math.max(ans,Math.max(prefix, suffix));
        }
        return ans;

    }
}
