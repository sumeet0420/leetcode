package com.learning.strings;

public class LeetCode1663_SmallestStringWithAGivenNumericValue {

    public String getSmallestString(int n, int k) {
        String temp = "a".repeat(n);
        int initialSum = 0;
        for(int i=0;i<n;i++){
            initialSum+=(temp.charAt(i)-'a'+1);
        }
        if(initialSum==k) return temp;
        char[] tempCharArray=temp.toCharArray();
        for(int i=n-1;i>=0;i--){
            int targetSum = k-initialSum;
            if(targetSum>=26){
                tempCharArray[i]='z';
                k-=25;
            } else{
                char ch = ((char)(targetSum+'a'));
                tempCharArray[i]=ch;
                return new String(tempCharArray);
            }

        }
        return new String(tempCharArray);
    }
}
