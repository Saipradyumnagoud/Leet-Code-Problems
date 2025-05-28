class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int[] previous = pairs[0];
        int count = 1;
        for (int[] pair : pairs) {
            if (pair[0] > previous[1]) {
                count++;
                previous = pair;
            }
        }

        return count;
    }
}