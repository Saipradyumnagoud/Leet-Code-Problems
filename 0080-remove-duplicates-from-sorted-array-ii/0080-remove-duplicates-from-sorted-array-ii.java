class Solution {
    public int removeDuplicates(int[] nums) {
        // HashMap<Integer, Integer> freq = new HashMap<>();
        // for(int num:nums){
        //     freq.put(num, freq.getOrDefault(num, 0) + 1);
        // }
        // int count=0;
        // for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        //     if(entry.getValue() > 2){
        //         count+=2;
        //     }else{
        //          count += entry.getValue();
        //     }
        // }
        // return count;
        int i = 0;
        for (int num : nums) {
            if (i < 2 || num != nums[i - 2]) {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}