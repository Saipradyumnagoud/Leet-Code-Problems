class Solution {
    public int minimizeSum(int[] nums) {
        int len = nums.length;

        Arrays.sort(nums);

        int diff1 = nums[len-1] - nums[2];
        int diff2 = nums[len-3] - nums[0];
        int diff3 = nums[len-2] - nums[1];

        return Math.min(diff1,Math.min(diff2,diff3));

    }
}