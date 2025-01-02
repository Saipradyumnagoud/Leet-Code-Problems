class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix.length;
        int[] newmatrix=new int[n*m];
        int a=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newmatrix[a++] = matrix[i][j];
            }
        }
        Arrays.sort(newmatrix);
        return newmatrix[k - 1];
    }
}