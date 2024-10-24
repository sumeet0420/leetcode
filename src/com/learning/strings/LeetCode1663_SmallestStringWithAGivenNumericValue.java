package com.learning.strings;

public class LeetCode1663_SmallestStringWithAGivenNumericValue {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(reverseString("arr"));
    }

    private static String reverseString(String input) {
        int left = 0;
        int right = input.length() - 1;
        //char[] inputArray = input.toCharArray();
        while (left < right) {
            char temp = input.toCharArray()[left];
            input.toCharArray()[left++] = input.toCharArray()[right];
            input.toCharArray()[right--] = temp;
        }
        return input;
    }
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Swap elements from both ends towards the center
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
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
