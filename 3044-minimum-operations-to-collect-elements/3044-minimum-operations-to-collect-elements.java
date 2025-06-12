class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> seen=new HashSet<>();
        int count=0;
        for(int i=nums.size()-1; i>=0;i--){
            int num =nums.get(i);
            if(num <= k){
                seen.add(num);
            }
            count++;
            if(seen.size()==k){
                return count;
            }
        }
        return -1;
    }
}