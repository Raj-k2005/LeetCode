// Title: Group Anagrams
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String
    [] strs) {
        Map<String, List<String>> map = new 
        HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

