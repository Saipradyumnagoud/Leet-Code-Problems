class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> result=new ArrayList<>();
        for(int num:nums){
            if(frequencyMap.get(num)==1){
                result.add(num);
            }
        }
        int[] uniqueNumbers = result.stream().mapToInt(Integer::intValue).toArray();
        return uniqueNumbers;
    }
}