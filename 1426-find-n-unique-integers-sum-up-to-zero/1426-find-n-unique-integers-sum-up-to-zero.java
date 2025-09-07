class Solution {
    public int[] sumZero(int n) {
        int[] nums=new int[n];
        int i=0,j=n-1;
        int x=n/2;
        while(i<=j){
            nums[i]=-x;
            nums[j]=x;
            i++;
            j--;
            x--;
        }
        return nums;
    }
}