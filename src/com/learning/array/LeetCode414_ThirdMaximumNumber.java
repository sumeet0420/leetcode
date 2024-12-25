package com.learning.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode414_ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        long num1 = Long.MIN_VALUE, num3 = Long.MIN_VALUE, num2 = Long.MIN_VALUE;
        for (long num : nums) {
            if (num == num1 || num == num2 || num == num3) continue;
            if (num > num1) {
                num3 = num2;
                num2 = num1;
                num1 = num;
            } else if (num > num2) {
                num3 = num2;
                num2 = num;
            } else if (num > num3) {
                num3 = num;
            }
        }
        return (int) (num3 != Long.MIN_VALUE ? num3 : num1);
    }

    public int secondMax(int[] nums) {
        if (nums.length == 2) return Math.min(nums[0], nums[1]);
        long num1 = Long.MIN_VALUE, num2 = Long.MIN_VALUE;
        for (long num : nums) {
            if (num == num1 || num == num2) continue;
            if (num > num1) {
                num2 = num1;
                num1 = num;
            } else if (num > num2) {
                num2 = num;
            }
        }
        return (int) (num2 == Long.MIN_VALUE ? num1 : num2);
    }

    public static void main(String[] args) {
        String word = "Stoftware";
        System.out.println(findRepeatingCharacter(word));
    }

    private static String findRepeatingCharacter(String word) {
        List<Character> set = new ArrayList<>();
        for (char ch : word.toCharArray()) {
            if(set.contains(ch)) return String.valueOf(ch);
            else set.add(ch);
        }
        return "";
    }
}
