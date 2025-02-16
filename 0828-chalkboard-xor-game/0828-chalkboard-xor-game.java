class Solution {
    public boolean xorGame(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x ^= num;
        }
        if (x == 0 || nums.length % 2 == 0) {
            return true;
        }
        return false;
    }
}