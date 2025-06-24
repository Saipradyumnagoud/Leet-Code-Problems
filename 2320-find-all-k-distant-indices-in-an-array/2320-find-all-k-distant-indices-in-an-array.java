class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                int indx = i;
                for(int j=0;j<n;j++){
                    if(Math.abs(j-indx)<=k){
                        set.add(j);
                    }
                }
            }
        }
        for(int i : set){
            ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
}