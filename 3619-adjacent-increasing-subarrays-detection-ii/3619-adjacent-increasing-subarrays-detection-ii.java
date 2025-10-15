class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int ans=1;
        int prev=0;
        int curr=1;
        int i=1;
        while(i<n){
            while(i<n && nums.get(i)>nums.get(i-1)){
                i++;
                curr++;
            }
            ans=Math.max(ans,Math.min(prev,curr));
            ans=Math.max(ans,curr/2);
            prev=curr;
            curr=1;
            i++;
        }
        return ans;
    }
}