class Solution {
    public int heightChecker(int[] heights) {
        int[] height2 = heights.clone();
        Arrays.sort(height2);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (height2[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}