class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        
        int newmax=0;
        for(int i=0;i<nums.length-1;i++){
            int max=0;
            max=nums[i+1]-nums[i];
            newmax=Math.max(max,newmax);
        }
        return newmax;
    }
}