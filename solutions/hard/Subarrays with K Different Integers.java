// Title: Subarrays with K Different Integers
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/subarrays-with-k-different-integers/

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    private int atMost(int[] nums, int k){
        int left=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums
            [right],0)+1);

            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
