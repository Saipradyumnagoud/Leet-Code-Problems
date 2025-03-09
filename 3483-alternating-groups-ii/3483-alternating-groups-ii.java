class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int validcount = 0;
        for (int i = 0; i < k - 1; i++) {
            if (colors[i] != colors[i + 1]) {
                validcount++;
            }
        }
        if (validcount == k - 1) {
            count++;
        }
        for (int i = 1; i < n; i++) {
            int previndex = (i - 1) % n;
            int newendindex = (i + k - 2) % n;
            if (colors[previndex] != colors[(previndex + 1) % n]) {
                validcount--;
            }
            if (colors[newendindex] != colors[(newendindex + 1) % n]) {
                validcount++;
            }
            if (validcount == k - 1)
                count++;
        }
        return count;
    }
}