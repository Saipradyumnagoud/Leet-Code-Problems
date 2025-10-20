class Solution {
    public int maxOperations(String s) {
        int ans = 0;
        int one = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                if (i == 0 || s.charAt(i - 1) == '0') {
                    continue;
                }

                ans += one;
            }
        }
        return ans;
    }
}