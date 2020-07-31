package com.apache.leetcode;

class Solution70 {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int a = 1;
        int b = 2;
        int cur = 0;
        for (int i = 3; i <= n; i++) {
            cur = a + b;
            a = b;
            b = cur;
        }
        return cur;
    }
}

public class LeetCode70 {
    public static void main(String[] args) {
        Solution70 s = new Solution70();
        for (int i = 1; i <= 10; i ++) {
            int res = s.climbStairs(i);
            System.out.println(res);
        }
    }
}
