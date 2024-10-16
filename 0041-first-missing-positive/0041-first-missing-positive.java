class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        boolean[] occ = new boolean[len+1];
        
        for (int n : nums) {
            if (n > 0 && n <= len) {
                occ[n] = true;
            }
        }
        for (int i = 1; i <= len; i++) {
            if (occ[i] == false) {
                return i;
            }
        }
        return len+1;
    }
}