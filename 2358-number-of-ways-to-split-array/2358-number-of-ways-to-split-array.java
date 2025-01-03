class Solution {
    public int waysToSplitArray(int[] nums) {
        // int validsplit=0;
        // int sum1=0;
        // int sum2=0;
        // int split=1;
        // while(split<nums.length){
        //     for(int i=0;i<split;i++){
        //         sum1+=nums[i];
        //     }
        //     for(int i=split;i<nums.length;i++){
        //         sum2+=nums[i];
        //     }
        //     split++;
        //     if(sum1>=sum2){
        //         validsplit++;
        //         sum1=0;
        //         sum2=0;
        //     }
        // }
        // return validsplit;
        long sum=0;
        int split=0;
        long total=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        for(int i=0;i<n-1;i++){
            sum+=nums[i];
            long sum2=total-sum;
            if(sum>=sum2){
                split++;
            }
        }
        return split;
    }
}