class Solution {
    public int matrixSum(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        for(int i=0;i<m ;i++){
            Arrays.sort(nums[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int maxcol=0;
            for(int j=0;j<m;j++){
                maxcol=Math.max(maxcol,nums[j][i]);
            }
            max+=maxcol;
        }
        return max;
    }
}