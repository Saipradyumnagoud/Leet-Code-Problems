class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int count = 0;
        int max = nums[0];
        int sum=0;
        Arrays.sort(nums);
        int median = nums[n / 2];
        for(int num:nums){
            count += Math.abs(num - median);
        }
        return count;
    }
}