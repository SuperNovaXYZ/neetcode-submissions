class Solution {
    public int maxProfit(int[] prices) {

        int lowestPrice= prices[0];
        int maxProfit= 0;

        for (int i=0; i<prices.length;i++){
            int currentPrice= prices[i];

            if(currentPrice < lowestPrice){
                lowestPrice= currentPrice;

            }else{
                int currentProfit= currentPrice - lowestPrice;
                if(currentProfit> maxProfit){
                    maxProfit=currentProfit;
                }
            }

        }

       return maxProfit;
        
    }
}
