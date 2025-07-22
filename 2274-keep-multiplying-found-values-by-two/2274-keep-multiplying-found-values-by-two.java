class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int result=original;
        while(isavailable(nums,result)){
            result=result*2;
        }
        return result;
    }
    public boolean isavailable(int[] nums, int result){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==result){
                return true;
            }
        }
        return false;
    }
}