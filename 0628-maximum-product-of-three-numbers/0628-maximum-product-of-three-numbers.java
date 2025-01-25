class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        // int prod=1;
        // for(int i=nums.length-1;i>=nums.length-4;i--){
        //     prod*=nums[i];
        // }
        // return prod;
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]);
    }
}