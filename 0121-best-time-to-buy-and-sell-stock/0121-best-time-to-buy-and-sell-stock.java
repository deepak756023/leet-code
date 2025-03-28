class Solution {
    public int maxProfit(int[] prices) {
        //TIME LIMIT EXCEEDED(203/208)
        // int diff = 0;
        // for(int i = 0; i < prices.length-1 ; i++){
        //     for(int j = i+1;  j < prices.length; j++){
        //         if(diff < prices[j]-prices[i]){
        //             diff = prices[j]-prices[i];

        //         }

        //     }
        // }
        // return diff;

        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}