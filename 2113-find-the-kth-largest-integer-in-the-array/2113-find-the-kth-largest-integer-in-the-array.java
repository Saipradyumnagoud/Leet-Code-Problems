class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // int[] num=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     num[i]=Integer.parseInt(nums[i]);
        // }
        // Arrays.sort(num);
        // int find=num.length-k;
        // String str = String.valueOf(num[find]);
        // return str;
        Arrays.sort(nums, (a, b) -> new java.math.BigInteger(b).compareTo(new java.math.BigInteger(a)));
        return nums[k - 1];
    }
}