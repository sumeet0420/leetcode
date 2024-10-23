package com.learning.hashtable;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode2405_OptimalPatitionOfString {

    public int partitionString(String s) {
        boolean[] visited = new boolean[26];
        int count = 1;
        for (char ch : s.toCharArray()) {
            if (visited[ch - 'a']) {
                count++;
                visited = new boolean[26];
            }
            visited[ch - 'a'] = true;
        }
        return count;
    }

}
