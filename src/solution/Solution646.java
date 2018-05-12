package solution;

import java.util.Arrays;

/**
 * Created by DELL on 2018-05-12.
 */
public class Solution646 {
    public int findLongestChain(int[][] pairs) {
        if (pairs.length < 2)
            return pairs.length;
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        int[] dp = new int[pairs.length];
        int max = 0;
        dp[0] = 1;
        for (int i = 0; i < pairs.length; i++) {
            for (int j = i+1; j < pairs.length; j++) {
                if(pairs[j][0]>pairs[i][1]){
                    dp[j]=dp[j]>dp[i]+1?dp[j]:dp[i]+1;
                }else{
                    dp[j]=dp[j]>0?dp[j]:1;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            if(max<dp[i])
                max = dp[i];
        }
        return max;

    }
}
