class Solution {
    public boolean check(int[] nums) {
        // int n=nums[0];
        // for(int i=0;i<n-1;i++){
        // if(nums[i+1]!=nums[i]+1){
        // return false;
        // }
        // }
        // return true;
        int n = nums.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[j] = nums[(j + i) % n];
            }
            boolean flag = true;
            for (int j = 0; j < n - 1; j++) {
                if (b[j] > b[j + 1])
                    flag = false;
            }
            if (flag)
                return true;
        }
        return false;
    }
}