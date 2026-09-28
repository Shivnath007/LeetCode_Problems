public class BestTimeToBuyAndSell {

    public int buyAndSell(int[] prices) {

        int lowestBuy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - lowestBuy);
            lowestBuy = Math.min(prices[i], lowestBuy);
        }
        return maxProfit;
    }

    public static void main(String[] args) {

    }
}
