class Solution {
    public int countDistinctIntegers(int[] nums) {
        int[] newnums = new int[nums.length + nums.length];
        for (int i = 0; i < nums.length; i++) {
            newnums[i] = nums[i];
        }
        for (int i = nums.length; i < 2 * nums.length; i++) {
            newnums[i] = rev(nums[i - nums.length]);
        }
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : newnums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return freqMap.size();
    }

    public int rev(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
}