// Title: Subarray Sum Equals K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-sum-equals-k/

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> nm=new HashMap<>();
        int presum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            if(presum==k){
                ans++;
            }
            if(nm.containsKey(presum-k)){
                ans+=nm.get(presum-k);
            }
            nm.put(presum, nm.getOrDefault(presum, 0)+1);
        }
        return ans;
