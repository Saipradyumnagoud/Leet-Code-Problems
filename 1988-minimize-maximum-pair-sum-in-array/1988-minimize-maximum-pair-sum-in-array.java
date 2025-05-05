class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < n / 2; i++) {
            int sum = nums[i] + nums[n - i - 1];
            max = Math.max(sum, max);
        }
        return max;
    }
}