class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int leftover=0;
        for(int num : map.keySet()){
            if(map.get(num) % 2 !=0){
                leftover++;
            }
        }
        int pairs=(nums.length-leftover)/2;
        return new int[]{pairs,leftover};
    }
}