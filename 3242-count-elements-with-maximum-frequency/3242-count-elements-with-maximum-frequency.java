class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        int max=0;
        int result=0;
        for(int num : nums){
            freq[num]++;
            max=Math.max(max,freq[num]);
        }
        for(int num : freq){
            if(num == max){
                result+=num;
            }
        }
        return result;
    }
}