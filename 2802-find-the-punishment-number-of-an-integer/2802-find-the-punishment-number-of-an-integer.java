class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            String str = String.valueOf(square);
            if (canSplit(str, 0, i)) {
                sum += square;
            }

        }
        return sum;
    }

    public boolean canSplit(String s, int index, int target) {
        if (index == s.length())
            return target == 0;
        for (int i = index + 1; i <= s.length(); i++) {
            int part = Integer.parseInt(s.substring(index, i));
            if (canSplit(s, i, target - part)) {
                return true;
            }
        }
        return false;
    }
}