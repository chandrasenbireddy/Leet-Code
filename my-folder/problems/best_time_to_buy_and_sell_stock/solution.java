class Solution {
    public int maxProfit(int[] prices) {
        //if prices array is less than 2 or empty
        if (prices == null || prices.length < 2){
            return 0;
        }
        //initializing min and max values
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        //loop through each peice in array
        for (int price: prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        // Calculate profit if we sell at the current price and update maxProfit if it's higher
            else {
                int profit = price - minPrice;
                if (maxProfit < profit ) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}