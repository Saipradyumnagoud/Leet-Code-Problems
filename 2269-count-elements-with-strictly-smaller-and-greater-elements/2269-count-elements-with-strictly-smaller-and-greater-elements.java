class Solution {
    public int countElements(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int small = 0, big = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] > nums[j]) {
                        small++;
                    } else if (nums[i] < nums[j]) {
                        big++;
                    }
                }
            }
            if (small > 0 && big > 0) {
                ans++;
            }
        }
        return ans;
    }
}