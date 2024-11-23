class Solution {
    public int maximumProfit(int prices[]) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE;  // To track the minimum price so far
        int maxProfit = 0;  // To track the maximum profit
        
        for (int price : prices) {
            // Update the minimum price
            minPrice = Math.min(minPrice, price);
            
            // Calculate the profit if selling at the current price
            int profit = price - minPrice;
            
            // Update the maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }
        
        return maxProfit;
    }
}