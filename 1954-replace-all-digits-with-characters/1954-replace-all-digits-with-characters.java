class Solution {
    public String replaceDigits(String s) {
        char[] c = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            int shift = c[i]-'0';
            c[i] = (char) ((c[i-1] - 'a' + shift) % 26 + 'a');
            ans.append(c[i - 1]);
            ans.append(c[i]);
        }
        if (s.length() % 2 != 0) {
            ans.append(c[c.length - 1]);
        }
        return ans.toString();
    }
}