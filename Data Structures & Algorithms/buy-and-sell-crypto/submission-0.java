class Solution {
    public int maxProfit(int[] prices) {
        int min_left = prices[0];
        int max_profit = 0;

        for(int i = 1; i< prices.length; i++) {
            int profit = prices[i] - min_left;
            max_profit = Math.max(max_profit, profit);
            min_left = Math.min(min_left, prices[i]);
        }

        return max_profit;
    }
}
