class Solution {
    public long coloredCells(int n) {
        long sum=1;
        int i=1;
        while(i<n){
            sum+=i*4;
            i++;
        }
        return sum;
        
    }
}