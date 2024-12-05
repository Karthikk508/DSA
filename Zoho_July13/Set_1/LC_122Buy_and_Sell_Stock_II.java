package Set_1;
public class LC_122Buy_and_Sell_Stock_II{

    public static void main(String[] args) {

        int[] prices = {7,5,1,2,3,7,6,4,5};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
            while (i < N && prices[i + 1] <= prices[i]) i++;
            buy = prices[i];

            while (i < N && prices[i + 1] > prices[i]) i++;
            sell = prices[i];

            profit += sell - buy;
        }
        return profit;
    }
}
