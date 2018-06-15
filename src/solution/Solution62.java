package solution;

public class Solution62 {
    public int uniquePaths(int m, int n) {
        int len = m * n;
        int[] dp = new int[len];
        dp[0] = 1;
        int i = 1;
        while (i < len) {
            int row = i / m;
            int col = i % m;
            System.out.print("row = " + row + " ");
            System.out.print("col = " + col + " ");
            ;
            if (row == 0) {
                dp[i] = dp[col - 1];
            } else if (col == 0) {
                dp[i] = dp[(row - 1) * m];
            } else {
                dp[i] = dp[i - 1] + dp[(row - 1) * m + col];
            }
            System.out.print("i = " + i + " ");
            System.out.println("dp[i] = " + dp[i]);
            i++;
        }
        return dp[len - 1];
    }

    public static void main(String[] args) {
        Solution62 solution = new Solution62();
        solution.uniquePaths(3, 7);
    }
}
