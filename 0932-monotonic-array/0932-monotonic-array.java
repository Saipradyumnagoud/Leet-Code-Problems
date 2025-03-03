class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isMonoinc = true;
        boolean isMonodec=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]< nums[i-1]){
                isMonoinc=false;
            }
            if(nums[i]>nums[i-1]){
                isMonodec=false;
            }
        }
        if(!isMonoinc && !isMonodec){
            return false;
        }
        return true;
    }
}