class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> unique=new HashSet<>();
        Set<Integer> prev=new HashSet<>();
        for(int num : arr){
            Set<Integer> curr=new HashSet<>();
            curr.add(num);
            for(int va : prev){
                curr.add(va | num);
            }
            prev=curr;
            unique.addAll(curr);
        }
        return unique.size();
    }
}