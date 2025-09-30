class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int i : map.keySet()) {
            if (map.get(i).equals(2)) {
                ans = ans ^ (i);
                
            }

        }
        return ans;
    }
}