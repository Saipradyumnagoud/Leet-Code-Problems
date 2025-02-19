class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        Map<Integer, Integer> scoreIndexMap = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            scoreIndexMap.put(score[i], i);
        }
        Arrays.sort(score);
        int n = score.length;
        for (int i = n - 1; i >= 0; i--) {
            int originalIndex = scoreIndexMap.get(score[i]);
            if (n - i == 1) {
                result[originalIndex] = "Gold Medal";
            } else if (n - i == 2) {
                result[originalIndex] = "Silver Medal";
            } else if (n - i == 3) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(n - i);
            }
        }

        return result;
    }
}