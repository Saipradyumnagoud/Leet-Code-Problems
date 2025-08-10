class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] nums=Integer.toString(n).toCharArray();
        Arrays.sort(nums);
        for(int i=0;i<32 ;i++){
            int powof2=(int)Math.pow(2,i);
            char[] pow=Integer.toString(powof2).toCharArray();
            Arrays.sort(pow);
            if(Arrays.equals(nums,pow)){
                return true;
            }
        }
        return false;
    }
}