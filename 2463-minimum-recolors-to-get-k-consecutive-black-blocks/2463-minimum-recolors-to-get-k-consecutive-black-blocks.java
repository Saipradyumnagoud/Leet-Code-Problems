class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minRecolor = Integer.MAX_VALUE;
        int white = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                white++;
            }
        }
        minRecolor = white;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                white--;
            }
            if (blocks.charAt(i) == 'W') {
                white++;
            }
            minRecolor = Math.min(minRecolor, white);
        }
        return minRecolor;
    }
}