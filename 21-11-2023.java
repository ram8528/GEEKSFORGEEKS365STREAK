class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int profit = 0;
        
        // Loop through the array from 1 to n-1
        for (int i = 1; i < prices.length; i++) {
            // If price on the next day is higher, add the profit (difference)
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        
        return profit;
    }
}