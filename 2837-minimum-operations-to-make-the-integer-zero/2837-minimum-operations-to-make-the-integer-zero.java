class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int k = 1; k <= 60; k++) {
            long x = (long) num1 - (long) k * num2;
            if(x < 0) break;
            int bitCount = Long.bitCount(x);
            if(bitCount <= k && k <= x) {
                return k;
            }
        }

        return -1;
    }
}