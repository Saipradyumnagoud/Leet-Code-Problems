class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                num.add(sum);
            }
        }
        Collections.sort(num);
        int result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + num.get(i)) % 1_000_000_007;
        }
        return result;
    }
}