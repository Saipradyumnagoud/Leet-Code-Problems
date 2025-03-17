class Solution {
    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0) {
            return false;
        }
        HashMap<Integer, Integer> countmap = new HashMap<>();
        for (int num : nums) {
            countmap.put(num, countmap.getOrDefault(num, 0) + 1);
        }
        for (int count : countmap.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}