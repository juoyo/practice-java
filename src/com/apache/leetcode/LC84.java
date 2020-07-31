package com.apache.leetcode;

import java.lang.Math;

public class LC84 {
}


class Solution84 {
    // 暴力
    public int largestRectangleArea(int[] heights) {
        int aera = 0;
        for (int i = 0; i < heights.length; i ++) {
            aera = Math.max(aera, calculateAera(heights, i));
        }
        return aera;
    }

    public int calculateAera(int[] heights, int left) {
        int s = 0;
        for (int i = left; i <heights.length; i++) {
            if (heights[left] > heights[i]) {
                s = heights[left] * (i - left);
            }
        }
        return s;
    }
}