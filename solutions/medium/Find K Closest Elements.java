// Title: Find K Closest Elements
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-k-closest-elements/

class Solution {
    public List<Integer> findClosestElements(int[] arr, int 
    k, int x) {
        //can use binary search approch to find the solution
        //need to be covered again for better understanding 
        int left=0;
        int right=arr.length-1;
        List<Integer> res=new ArrayList<>();

        if(k==arr.length){
            for(int ele: arr){
                res.add(ele);
            }
            return res;
        }

        while(left<right){
