class Solution {
    public int maximumDifference(int[] nums) {
        int maxval=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    maxval=Math.max(nums[j]-nums[i],maxval);
                }
            }
        }
        return maxval;
    }
}