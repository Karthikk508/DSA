public class Best_time_to_sell_buy {
    public static void main(String[] args) {
        int[] prices ={7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println(ans);
        maxxProfit(prices);
    }
    public static int maxProfit(int[] prices) {

        int i = 0;

        int ans = 0;
        int profit = 0;
        while (i<prices.length)
        {
            if(profit>ans) ans=profit;
            profit = 0;
            int j = i+1;
            while(j<prices.length)
            {
                if(profit<prices[j]-prices[i])
                    profit = prices[j]-prices[i];

                j++;
            }
            i++;
        }
        System.out.println(ans);
        if(ans<0) return 0;
        else return ans;
    }
    public static int maxxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        System.out.println(lsf);
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

}
