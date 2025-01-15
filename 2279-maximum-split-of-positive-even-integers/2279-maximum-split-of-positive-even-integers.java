class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return ans;
        }
        long current = 2;
        while (finalSum >= current) {
            ans.add(current);
            finalSum -= current;
            current += 2;
        }
        if (finalSum > 0) {
            ans.set(ans.size() - 1, ans.get(ans.size() - 1) + finalSum);
        }
        return ans;
    }
}