class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = isAvailable(i, nums);
        }
        return result;
    }

    public int isAvailable(int index, int[] nums) {
        int n = nums.length;
        int current = nums[index];
        for (int i = 1; i < n; i++) {
            int nextIndex = (index + i) % n;
            if (nums[nextIndex] > current) {
                return nums[nextIndex];
            }
        }
        return -1;
    }
}