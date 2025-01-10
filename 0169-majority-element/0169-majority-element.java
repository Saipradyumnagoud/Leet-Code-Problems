class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int answer=nums[nums.length/2];
        return answer;
    }
}