package com.learning.array;

import java.util.Arrays;

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
        if(nums.length==2) return Math.min(nums[0], nums[1]);
        int num1 = Integer.MIN_VALUE, num2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == num1 || num == num2) continue;
            if (num > num1) {
                num2=num1;
                num1 = num;
            } else if (num > num2) {
                num2 = num;
            }
        }
        return num2 == Integer.MIN_VALUE ? num1 : num2;
    }
}
