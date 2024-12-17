class Solution {
    public void moveZeroes(int[] nums) {
        int zeroindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[zeroindex]=nums[i];
                zeroindex++;
            }
        }
        for(int i=zeroindex ; i<nums.length;i++){
            nums[i]=0;
        }
    }
}