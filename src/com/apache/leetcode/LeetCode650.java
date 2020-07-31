package com.apache.leetcode;

class Solution650 {
    public int minSteps(int n) {
        if (n == 1) {
            return 0;
        }

        int res = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                res = res + i;
                System.out.printf("i= %d, res= %d\n", i, res);
                n = n / i;
            }
        }
        return res;
    }
}
public class LeetCode650 {
    public static void main(String[] args) {
        Solution650 s = new Solution650();
        int res = s.minSteps(20);
        System.out.println(res);
    }
}
