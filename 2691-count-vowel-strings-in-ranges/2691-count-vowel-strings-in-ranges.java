class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixsum = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            char start = words[i].charAt(0);
            char end = words[i].charAt(words[i].length() - 1);
            if (isVowel(start) && isVowel(end)) {
                prefixsum[i + 1] = 1 + prefixsum[i];
            } else {
                prefixsum[i + 1] = prefixsum[i];
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = prefixsum[end + 1] - prefixsum[start];
        }

        return result;
    }
}