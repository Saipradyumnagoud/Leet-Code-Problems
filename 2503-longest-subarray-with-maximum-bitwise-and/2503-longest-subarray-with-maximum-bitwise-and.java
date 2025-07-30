class Solution {
    public int longestSubarray(int[] nums) {
        int maxAnd=0;
        for(int num : nums){
            maxAnd=Math.max(num , maxAnd);
        }

        int max=0, currLen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maxAnd){
                currLen++;
                max=Math.max(max,currLen);
            }else{
                currLen=0;
            }
        }
        return max;
    }
}