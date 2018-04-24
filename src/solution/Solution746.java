package solution;

/**
 * Created by DELL on 2018-04-23.
 */
public class Solution746 {
    public int getMin(int x,int y){
        return x>y?y:x;
    }

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] pay = new int [len];
        for(int i = 2;i<len;i++){
            pay[i] = getMin(pay[i-1]+cost[i-1],pay[i-2]+cost[i-2]);
        }
        return getMin(pay[len - 1]+cost[len-1], pay[len - 2]+cost[len-2]);

    }
    public int minCostClimbingStairs1(int[] cost) {
        for(int i = 2; i < cost.length; i++)
        {
            cost[i] = cost[i] + Math.min(cost[i-2], cost[i-1]);
        }

        return Math.min(cost[cost.length-1], cost[cost.length - 2]);
    }

    public static void main(String[] args) {
        Solution746 solution = new Solution746();
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(solution.minCostClimbingStairs(cost));
    }
}
