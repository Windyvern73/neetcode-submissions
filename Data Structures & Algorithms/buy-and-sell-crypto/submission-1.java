class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = 0;
        int sell = 1;
        while(sell < prices.length) {
            int profit = prices[sell] - prices[buy];
            if(profit > 0) {
                max = Math.max(max, profit);
            }
            else {
                buy = sell;
            }
            sell++;
        }
        return max;
    }
}
