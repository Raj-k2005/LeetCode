// Title: Sort Colors - Counting Sort
// Difficulty: Medium
// Language: Java
// Link: https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        int[] frequencies = new int[3];

        for (int color : nums) {
            frequencies[color]++;
        }

        int writeIndex = 0;
        for (int color = 0; color < frequencies.length; color++) {
            int occurrences = frequencies[color];
            while (occurrences-- > 0) {
                nums[writeIndex++] = color;
            }
        }
    }
}