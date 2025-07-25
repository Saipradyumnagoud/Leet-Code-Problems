class Solution {
    public int maxSum(int[] nums) {
        int sum=0;
        Set<Integer> set=new HashSet<>();
        Arrays.sort(nums);
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
                if(num>0){
                    sum+=num;
                }
            }
        }
        if(sum==0){
            return nums[nums.length-1];
        }
        return sum;
    }
}