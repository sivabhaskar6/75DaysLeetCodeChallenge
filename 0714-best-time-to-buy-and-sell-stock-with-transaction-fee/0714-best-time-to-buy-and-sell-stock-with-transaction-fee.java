class Solution {
    public int maxProfit(int[] prices, int fee) 
    {
        int buy = -prices[0];
        int sell = 0;
        for(int i=1;i<prices.length;i++)
        {
            int prevbuy=buy;
            int prevsell=sell;

            buy=Math.max(prevbuy,prevsell-prices[i]);
            sell=Math.max(prevsell,prevbuy+prices[i]-fee);
        }
        return sell;
    }
}