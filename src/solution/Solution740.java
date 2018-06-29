package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution740 {
//    dp[i] = MAX(dp[i+2] + N[i] , dp[i+1])
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        for (int num : nums) {
            sum[num] += num;
        }
        //dp[i]表示选择值为i元素时，最大的结果
        int[] dp = new int[10001];
        dp[1] = sum[1];
        for (int i = 2; i <= 10000; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + sum[i]);
        }

        return dp[10000];
    }

}
