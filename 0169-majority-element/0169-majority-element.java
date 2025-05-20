class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> freqmap=new HashMap<>();
        for(int num : nums){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()){
            if((entry.getValue() )>n/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}