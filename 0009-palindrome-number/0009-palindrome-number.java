class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String num = new StringBuilder(String.valueOf(x)).reverse().toString();
        return String.valueOf(x).equals(num);
    }
}