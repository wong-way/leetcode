package solution;

/**
 * Created by DELL on 2017-07-17.
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=1;i<prices.length;i++){
            int temp=0;
            temp+= prices[i]-prices[i-1];
            if(temp<0)
                temp=0;
            if(temp>max)
                max =temp;
        }
        return max;
    }
}
