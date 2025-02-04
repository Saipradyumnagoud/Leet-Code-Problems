class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0;
        int current=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                current+=nums[i];
            }else{
                max=Math.max(max,current);
                current=nums[i];
            }
        }
        return Math.max(max,current);
    }
}