class Solution {
    public long countBadPairs(int[] nums) {
        long good = 0;
        long n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = nums[i] - i;
            if (freq.containsKey(key)) {
                good += freq.get(key);
            }
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }
        long bad = n * (n - 1) / 2 - good;
        return bad;
    }
}