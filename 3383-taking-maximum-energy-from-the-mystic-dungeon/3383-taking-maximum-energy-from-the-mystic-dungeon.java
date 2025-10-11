class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n=energy.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            int val=0;
            for(int j=i;j<n;j=j+k){
                if(val<=0){
                    val=energy[j];
                }else{
                    val=val+energy[j];
                }
            }
            ans=Math.max(ans,val);
        }
        return ans;
    }
}