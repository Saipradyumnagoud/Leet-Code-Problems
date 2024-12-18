class Solution {
    public int[] finalPrices(int[] prices) {
        // for(int i=0;i<prices.length-1;i++)
        // if(prices[i]>=prices[i+1]){
        //     prices[i]=prices[i]-prices[i+1];
        // }
        // return prices;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[i]>=prices[j]){
                    prices[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}