import static java.lang.Math.max;

class Solution198 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        int maxValue = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > maxValue) {
                maxValue = dp[i];
            }
        }
        return maxValue;
    }
}

public class LeetCode198 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 1, 2};
        Solution198 s = new Solution198();
        int res = s.rob(nums);
        System.out.println(res);
    }
}
