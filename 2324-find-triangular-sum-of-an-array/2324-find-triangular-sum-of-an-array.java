class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        for(int num : nums){
            lst.add(num);
        }
        int sum=0;
        while(lst.size()>1){
            List<Integer> newlist=new ArrayList<>();
            for(int i=0;i<lst.size()-1;i++){
                sum=0;
                sum+=(lst.get(i)+lst.get(i+1))%10;
                newlist.add(sum);
            }
            lst=newlist;
        }
        return lst.get(0);
    }
}