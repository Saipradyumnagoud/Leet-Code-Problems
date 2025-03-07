class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ans = {-1,-1};
        List<Integer> primes = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                ans[0] = primes.get(i - 1);
                ans[1] = primes.get(i);
            }
        }

        return ans;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}