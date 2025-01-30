package example;

public class BestTime2BuySellStock {
    // prices = [7,1,5,3,6,4]
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        int minPrice = Integer.MAX_VALUE; // represents  infinity

        for (int price : prices){
            if (price < minPrice){
                minPrice = price;
            }else {
                int profit = price - minPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;

    }
}