class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;
        for (int i = 0; i <=nums.length - 3; i++) {
            if (nums[i] == 0) {
                for (int j = 0; j < 3; j++) {
                    nums[i + j] = 1 - nums[i + j];
                }
                operations++;
            }
        }
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 0) {
                return -1;
            }
        }
        return operations;
    }
}