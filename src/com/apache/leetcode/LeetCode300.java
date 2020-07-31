package com.apache.leetcode;

class Solution300 {
    public int lengthOfLIS(int[] nums) {
        // dp[n] = max{1, dp[i] + 1 | Si < Sn & i < n}
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int maxValue = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    maxValue = Math.max(maxValue, dp[j] + 1);
                }
            }
            dp[i] = maxValue;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}

public class LeetCode300 {
    public static void main(String[] args) {
        Solution300 s = new Solution300();
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        int res = s.lengthOfLIS(nums);
        System.out.println(res);
    }
}
