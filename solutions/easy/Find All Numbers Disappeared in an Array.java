// Title: Find All Numbers Disappeared in an Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index] > 0){
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                 ans.add(i+1);
            }
        }
        return ans;
    }
}
