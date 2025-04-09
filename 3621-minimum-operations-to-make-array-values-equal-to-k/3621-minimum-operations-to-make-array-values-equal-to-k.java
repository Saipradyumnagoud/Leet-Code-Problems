class Solution {
    public int minOperations(int[] nums, int k) {
        int operations =0;
        Set<Integer> uniqueElements = new HashSet<>();
        for(int num:nums){
            uniqueElements.add(num);
        }
        for(int i : uniqueElements){
            if(i==k)
                continue;
            if(i<k)
                return -1;
            operations++;
        }
        return operations;
    }
}