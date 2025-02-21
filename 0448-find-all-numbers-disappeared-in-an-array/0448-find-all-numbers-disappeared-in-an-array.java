class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        HashSet<Integer> number = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            number.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!number.contains(i)) {
                answer.add(i);
            }
        }
        return answer;
    }
}