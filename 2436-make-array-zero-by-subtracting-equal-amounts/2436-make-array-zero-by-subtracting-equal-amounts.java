class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> numbers=new HashSet<>();
        for(int num : nums){
            if(num >=1){
                numbers.add(num);
            }
        }
        return numbers.size();
    }
}