class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            elementsum+=nums[i];
            digitsum+=sumofdigits(nums[i]);
        }
        return Math.abs(elementsum-digitsum);
    }
    public int sumofdigits(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}