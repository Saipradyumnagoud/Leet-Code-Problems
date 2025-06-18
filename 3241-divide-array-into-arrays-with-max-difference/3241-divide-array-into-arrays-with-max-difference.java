class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n % 3 != 0)
            return new int[0][0];
        int[][] ans = new int[n / 3][3];
        int index = 0;
        for (int i = 0; i < n; i += 3) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if (c - a > k) {
                return new int[0][0];
            }
            ans[index][0] = a;
            ans[index][1] = b;
            ans[index][2] = c;
            index++;
        }
        return ans;
    }
}