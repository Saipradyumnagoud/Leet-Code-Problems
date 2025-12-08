class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int c = i*i + j *j;
                int cvalue=(int)Math.sqrt(c);
                if(cvalue*cvalue == c && cvalue<=n){
                    count++;
                }
            }
        }
        return count;
    }
}