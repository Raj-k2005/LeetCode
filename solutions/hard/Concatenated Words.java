// Title: Concatenated Words
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/concatenated-words/

class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashMap<String,Boolean> hm=new HashMap<>();
        Set<String> hs=new HashSet<>();
        for(String word:words){
            hs.add(word);
        }
        List<String> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(IsConcat(words[i],hs,hm)){
                result.add(words[i]);
            }
        }
        return result;
    }
    public static boolean IsConcat(String word, Set<String> st, Map<String,
    Boolean> hm){
        if(hm.containsKey(word)){
            return hm.get(word);
        }
