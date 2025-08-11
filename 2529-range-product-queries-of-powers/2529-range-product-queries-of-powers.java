class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            if ((n / (int) Math.pow(2, i)) % 2 == 1) {
                powers.add((int) Math.pow(2, i));
            }
        }
        int MOD = 1_000_000_007;
        int[] result = new int[queries.length];
        for (int t = 0; t < queries.length; t++) {
            int i = queries[t][0];
            int j = queries[t][1];
            long prod = 1;
            for (int k = i; k <= j; k++) {
                prod = (prod * powers.get(k)) % MOD;
            }
            result[t] = (int) prod;
        }
        return result;
    }
}