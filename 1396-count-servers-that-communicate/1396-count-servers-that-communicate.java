class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rowcount = new int[m];
        int[] colcount = new int[n];
        int servers = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowcount[i]++;
                    colcount[j]++;
                    servers++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && rowcount[i] == 1 && colcount[j] == 1) {
                    servers--;
                }
            }
        }
        return servers;
    }
}