class Solution {
    public int maxProfit(int[] prices) {    
        int minSF = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            int min = prices[i];
            if(min<=minSF){
                minSF= min;
            }
            int profit = prices[i]-minSF;
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
     
    }
}