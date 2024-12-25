package com.learning.strings;

public class LeetCode1170_CompareStringsByFreqOfSmallestCharacter {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res = new int[queries.length];
        int i=0;
        for(String query:queries){
            int count = 0;
            int freqCompare = smallestLexicoFreqquency(query);
            for(String word:words)
                if(freqCompare<smallestLexicoFreqquency(word)) count++;
            res[i++] = count;
        }
        return res;
    }

    private int smallestLexicoFreqquency(String query){
        int[] freq = new int[26];
        for(char ch:query.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return freq[i];
            }
        }
        return -1;
    }
}
