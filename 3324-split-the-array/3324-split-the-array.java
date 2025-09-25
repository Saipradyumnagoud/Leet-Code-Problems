class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for(int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
            if(counter.get(num) > 2) {
                return false;
            }
        }
        return true;
    }
}