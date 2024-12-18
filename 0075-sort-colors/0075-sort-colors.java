class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        // System.out.print(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[small]){
                    small=j;
                }
                
            }
            int temp = nums[i];
                nums[i] = nums[small];
                nums[small] = temp;
        }
    }
}