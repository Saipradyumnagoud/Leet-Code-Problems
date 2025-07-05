class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length())
            return -1;
        if (haystack.length() == needle.length() && haystack.equals(needle)) {
            return 0;
        }
        int left = 0;
        int right = needle.length();
        while (right <= haystack.length()) {
            if (haystack.substring(left, right).contains(needle)) {

                return left;
            }
            left++;
            right++;
        }
        return -1;
    }
}