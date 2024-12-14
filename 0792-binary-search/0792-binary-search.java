class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        // return -1;
        int left,right,mid;
        left=0;
        right=nums.length-1;
        while(left<=right){
            mid=(left+right)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}