package com.apache.leetcode;

import static java.lang.Math.max;
class Solution213 {
    public int rob1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // dp[i]表示到位置i为止最大数
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        // int maxValue = 0;
        // for (int i = 0; i < dp.length; i++) {
        //     if (dp[i] > maxValue) {
        //         maxValue = dp[i];
        //     }
        // }
        // return maxValue;
        return dp[nums.length - 1];
    }

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] deleteLast = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            deleteLast[i] = nums[i];
        }
        int[] deleteFirst = new int[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            deleteFirst[i - 1] = nums[i];
        }

        int res = max(rob1(deleteLast), rob1(deleteFirst));
        return res;
    }
}

public class LeetCode213 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 1};
        Solution213 s = new Solution213();
        int res = s.rob(nums);
        System.out.println(res);
    }
}
