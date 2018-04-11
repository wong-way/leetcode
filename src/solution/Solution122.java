package solution;

/**
 * Created by DELL on 2017-07-21.
 */
public class Solution122 {
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for(int i=1; i<prices.length ; i++){
            if(prices[i]-prices[i-1]>0)
                sum+= prices[i]-prices[i-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] test = {3, 5, 8, 1, 9};
        int result = maxProfit(test);
        System.out.println(result);
    }
}