class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if ((sum + target) % 2 != 0 || sum + target < 0) {
            return 0;
        }

        int targetSum = (sum + target) / 2;

        int[] answer = new int[targetSum + 1];
        answer[0] = 1;
        for (int num : nums) {
            for (int j = targetSum; j >= num; j--) {
                answer[j] += answer[j - num];
            }
        }

        return answer[targetSum];
    }
}
