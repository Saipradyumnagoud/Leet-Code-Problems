class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        int count=0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            int value=Math.max(happiness[i]-count,0);
            ans+=value;
            count++;
        }
        return ans;
    }
}