
class Solution {
    public int maximumSum(int[] nums) {
        int max = -1;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int num : nums) {
            int x = countSum(num);
            map.computeIfAbsent(x, k -> new PriorityQueue<>((a, b) -> b - a)).add(num);

        }
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() < 2) {

            } else {
                int x = entry.getValue().poll() + entry.getValue().poll();
                max = Math.max(max, x);
            }
        }
        return max;
    }

    private int countSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}