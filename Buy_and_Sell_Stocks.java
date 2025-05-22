class Solution {
    public int maxProfit(int[] prices)
     {
        int max=0,min=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            else if(prices[i]-min> max)
            {
                max=prices[i]-min;
            }
        }
        return max;
    }
}
