class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        // Map<Integer, Integer> fre = new HashMap<>();
        // for (int num : nums) {
        //     fre.put(num, fre.getOrDefault(num, 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> entry : fre.entrySet()) {
        //     if (entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // }
        // return 0;
        int ans=0;
        for(int num : nums){
            ans^=num;
        }
        return ans;
    }
}