// Title: Maximum Product Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-product-subarray/

        int ans = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (pre == 0) {
                pre = 1;
            }

            if (suff == 0) {
                suff = 1;
            }

            pre = pre * nums[i];
            suff = suff * nums[nums.length - 1 - i];

            ans = Math.max(ans, Math.max(pre, suff));
        }

        return ans;
