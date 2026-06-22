class Solution {
    public int maxProfit(int[] prices) {
        int low_buy=prices[0];
        int max_profit=Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            low_buy=Math.min(prices[i],low_buy);
            int sell=prices[i];
            max_profit=Math.max(sell-low_buy,max_profit);

        }

        return max_profit;
    }
}
