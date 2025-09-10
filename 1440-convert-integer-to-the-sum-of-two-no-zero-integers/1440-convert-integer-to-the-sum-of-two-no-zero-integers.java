class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] nums=new int[2];
        for(int i=1;i<n/2 +1 ;i++){
            int j=n-i;
            if(ifNoZero(i) && ifNoZero(j)){
                nums[0]=i;
                nums[1]=j;
                return nums;
            }
        }
        return new int[]{};
    }
    public boolean ifNoZero(int i){
        while(i>0){
            if(i%10==0){
                return false;
            }i/=10;
        }
        return true;
    }
}