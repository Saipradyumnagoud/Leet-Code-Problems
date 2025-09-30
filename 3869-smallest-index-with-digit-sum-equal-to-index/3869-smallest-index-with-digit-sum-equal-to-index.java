class Solution {
    public int smallestIndex(int[] nums) {
        int idx=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(digitSum(nums[i])==i){
                idx=Math.min(idx,i);
            }
        }
        if(idx<=1000){
            return idx;
        }else{
            return -1;
        }
    }
    public int digitSum(int num ){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}