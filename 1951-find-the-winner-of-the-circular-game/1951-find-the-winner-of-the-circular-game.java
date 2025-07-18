class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        int curridx=0;
        while(nums.size()>1){
            int indextoremove=(curridx+k-1)%nums.size();
            nums.remove(indextoremove);
            curridx=indextoremove;
        }
        return nums.get(0);
    }
}