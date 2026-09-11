// Title: Find All Numbers Disappeared in an Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

        //          ans.add(i+1);
        //     }
        // }
        // return ans;
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
