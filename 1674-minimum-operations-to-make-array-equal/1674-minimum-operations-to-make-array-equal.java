class Solution {
    public int minOperations(int n) {
        int[] nums=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            nums[i]=(2*i)+1;
            s+=nums[i];
        }
        int t=s/n;
        int count=0;
        int left=0,right=n-1;
        while(left<n/2){
            int a=nums[left];
            int b=nums[right];
            while(a<t && b>t){
                a+=1;
                b-=1;
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
}