class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int len = nums.length;
        if (len % k != 0)
            return false;
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(nums);
        for (int num : nums) {
            if (countMap.get(num) == 0)
                continue;
            for (int i = 0; i < k; i++) {
                int current = num + i;
                if (countMap.getOrDefault(current, 0) == 0) {
                    return false;
                }
                countMap.put(current, countMap.get(current) - 1);
            }
        }

        return true;
    }
}