class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] arr=new int[n*n+1];
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[grid[i][j]]++;
            }
        }
        for(int i=0;i<=n*n;i++){
            if(arr[i]>1){
                ans[0]=i;
            }
            if(arr[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}