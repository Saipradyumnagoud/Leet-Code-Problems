class Solution {
    public int smallestNumber(int n) {
        String binary = Integer.toBinaryString(n);
        int ans = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            String ansnumber = Integer.toBinaryString(i);
            if (binary.length() == ansnumber.length()) {
                if (checkset(ansnumber)) {
                    ans = Integer.parseInt(ansnumber, 2);
                    break;
                }
            }
        }
        return ans;
    }

    public boolean checkset(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}