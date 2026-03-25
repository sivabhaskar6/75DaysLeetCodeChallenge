class Solution {
    public int maxProfit(int[] prices) 
    {
        int res = 0,min = prices[0];
        for(int i=1;i<prices.length;i++)
        {  if(min>prices[i])
                min=prices[i];
            if(res<prices[i]-min)
                res=prices[i]-min;
        }
        return res;
    }
}