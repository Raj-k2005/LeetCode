// Title: Maximum Number of Words Found in Sentences
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/


class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String s : sentences) {
            int words = s.split(" ").length;

            if (words > max) {
                max = words;
            }
        }

        return max;
    }
}

