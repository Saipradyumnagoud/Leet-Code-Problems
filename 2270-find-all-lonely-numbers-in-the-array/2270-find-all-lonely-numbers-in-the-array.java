class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            boolean isLonely = true;
            if (i > 0 && (nums[i] - 1 == nums[i - 1] || nums[i] == nums[i - 1])) {
                isLonely = false;
            }
            if (i < nums.length - 1 && (nums[i] + 1 == nums[i + 1] || nums[i] == nums[i + 1])) {
                isLonely = false;
            }
            if (isLonely) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}