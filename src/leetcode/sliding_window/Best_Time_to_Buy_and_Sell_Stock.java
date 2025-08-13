package leetcode.sliding_window;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int left=0, right=1;
        int maxProfit=0,profit=0;

        while(right < prices.length){
            if(prices[left] < prices[right]){
                profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                left = right ;
            }
            right++;
        }
        return maxProfit;
    }
}
