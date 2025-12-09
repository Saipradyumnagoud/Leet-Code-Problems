class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int num : nums){
            sum+=num;
        }
        int count=0;
        int leftsum=0;
        int rightsum=sum;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            rightsum-=nums[i];
            if(Math.abs(leftsum-rightsum)%2==0){
                count++;
            }
        }
        return count;
    }
}