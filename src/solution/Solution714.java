package solution;

/**
 * Created by DELL on 2018-05-18.
 */
public class Solution714 {
    public int maxProfit(int[] prices, int fee) {
        int[] own = new int[prices.length];
        int[] notOwn = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            //own[i]表示第i次结束拥有股票时最大利润
            // - i-1次拥有，继续保留
            // - i-1次没有，重新购入
            own[i] = Math.max(notOwn[i - 1] - prices[i], own[i - 1] + prices[i] - prices[i - 1]);
            //notOwn[i]表示第i次结束没有股票时最大利润
            // - i-1次拥有，卖出
            // - i-1次没有，保持
            notOwn[i] = Math.max(own[i - 1] + prices[i] - prices[i - 1] - fee, notOwn[i - 1]);
            System.out.println(own[i] + " " + notOwn[i]);

        }
        return Math.max(own[prices.length - 1], notOwn[prices.length - 1]);
    }

    public int maxProfit1(int[] prices, int fee) {
        int[] own = new int[prices.length];
        int[] notOwn = new int[prices.length];
        own[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            //own[i]表示第i次结束拥有股票时最大利润
            // - i-1次拥有，继续保留
            // - i-1次没有，重新购入
            own[i] = Math.max(notOwn[i - 1] - prices[i], own[i - 1]);
            //notOwn[i]表示第i次结束没有股票时最大利润
            // - i-1次拥有，卖出
            // - i-1次没有，保持
            notOwn[i] = Math.max(own[i - 1] + prices[i] - fee, notOwn[i - 1]);
            System.out.println(own[i] + " " + notOwn[i]);
        }
        return notOwn[prices.length - 1];
    }
    public int maxProfit2(int[] prices, int fee) {
        int own = -prices[0];
        int notOwn =0;

        for (int i = 1; i < prices.length; i++) {
            //own[i]表示第i次结束拥有股票时最大利润
            // - i-1次拥有，继续保留
            // - i-1次没有，重新购入
            own = Math.max(notOwn - prices[i], own);
            //notOwn[i]表示第i次结束没有股票时最大利润
            // - i-1次拥有，卖出
            // - i-1次没有，保持
            notOwn = Math.max(own+ prices[i] - fee, notOwn);
            System.out.println(own + " " + notOwn);
        }
        return notOwn;
    }
    public int maxProfit3(int[] prices, int fee) {
        int cash = 0, hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
            System.out.println(cash + " " + hold);
        }
        return cash;
    }

    public static void main(String[] args) {
        int prices[] = {1, 3, 2, 8, 4, 9};

        Solution714 solution = new Solution714();
        System.out.println(solution.maxProfit2(prices, 2));
        System.out.println(solution.maxProfit3(prices, 2));
    }

}
