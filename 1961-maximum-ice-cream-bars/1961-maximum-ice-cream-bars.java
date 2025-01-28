class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum = 0;
        int count = 0;
        Arrays.sort(costs);
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coins) {
                sum += costs[i];
                coins = coins - costs[i];
                count++;
            }
        }
        return count;
    }
}