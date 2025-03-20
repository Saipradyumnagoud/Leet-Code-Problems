class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> nums=new ArrayList<>();
        int min=0;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                int check=matrix[i][j];
                boolean isMin=true;
                for(int k=0;k<n;k++){
                    if(matrix[i][k]<check){
                        isMin=false;
                        break;
                    }
                }
                boolean isMax=true;
                for(int k=0;k<m;k++ ){
                    if(matrix[k][j]>check){
                        isMax=false;
                        break;
                    }
                }
                if(isMin && isMax){
                    nums.add(check);
                }
            }
        }
        return nums;
    }
}