class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // for (char ch : s2.toCharArray()) {
        // if (s1.indexOf(ch) == -1) {
        // return false;
        // }
        // }
        // return true;

        if (s1.equals(s2)) {
            return true;
        }

        int n = s1.length();
        int first = -1;
        int second = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false;
                }
                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        return count == 2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);
    }
}