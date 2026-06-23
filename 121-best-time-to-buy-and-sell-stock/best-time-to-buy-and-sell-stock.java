class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, buy = prices[0];
        for(int i=0;i<prices.length;i++){
            int profit = prices[i] - buy;
            max = Math.max(profit,max);
            buy = Math.min(buy,prices[i]);
        }
        return max;
    }
}