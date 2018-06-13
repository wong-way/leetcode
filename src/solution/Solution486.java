package solution;

public class Solution486 {
    public boolean PredictTheWinner(int[] nums) {
        int dp[][] = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {

            dp[i][i] = nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >=0; j--) {
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][nums.length - 1] >= 0;
    }

    public boolean PredictTheWinner1(int[] nums) {
        int[] dp = new int[nums.length];
        for (int j = 0; j < dp.length; j++) {
            for (int i = j; i >= 0; i--) {
                if (i == j) {
                    dp[i] = nums[i];
                    continue;
                }
                dp[i] = Math.max(nums[i]- dp[i+1], nums[j] - dp[i]);
            }
        }
        return dp[0] >= 0;
    }

    public static void main(String[] args) {
        Solution486 solution = new Solution486();
        int[] nums = {1, 5, 2};
        solution.PredictTheWinner(nums);
    }
}
