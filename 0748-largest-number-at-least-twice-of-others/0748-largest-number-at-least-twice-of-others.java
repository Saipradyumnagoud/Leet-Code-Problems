class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int maxindex = 0;
        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxindex = i;
            }

        }
        for (int i = 0; i < n; i++) {
            if (i != maxindex && max < 2 * nums[i]) {
                return -1;
            }
        }
        return maxindex;
    }
}