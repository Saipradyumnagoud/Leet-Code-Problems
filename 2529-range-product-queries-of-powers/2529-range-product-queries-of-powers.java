class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> powers = new ArrayList<>();
        int x = 1;
        while(n > 0) {
            if((n & 1) == 1) {
                powers.add(x);
            }
            n = n >> 1;
            x *= 2;
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