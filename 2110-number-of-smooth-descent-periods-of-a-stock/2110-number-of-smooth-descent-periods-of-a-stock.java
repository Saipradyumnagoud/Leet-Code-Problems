class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans=prices.length;
        int prev=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]==prices[i-1]-1){
                ans=ans+(i-prev);
            }else{
                prev=i;
            }
        }
        return ans;
    }
}