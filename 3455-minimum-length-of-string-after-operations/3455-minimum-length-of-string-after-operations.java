class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 == 1) {
                count += 1;
            } else {
                count += Math.min(2, freq[i]);
            }
        }
        return count;
    }
}