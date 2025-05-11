class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 3;
        for (int num : arr) {
            if (num % 2 != 0) {
                count--;
                if (count == 0) {
                    return true;
                }
            }
            if (num % 2 == 0) {
                count = 3;
            }
        }
        return false;
    }
}