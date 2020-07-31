package com.apache.leetcode;

class Solution343 {
    public int integerBreak(int n) {
        if (n == 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {

                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * integerBreak(i - j)));
//                dp[i] = Math.max(j * (i - j), j * integerBreak(i - j));  // 错误
            }
        }
        return dp[n];
    }
}

public class LeetCode343 {
    public static void main(String[] args) {
        Solution343 s = new Solution343();
        int res = s.integerBreak(10);
        System.out.println(res);
    }
}
