class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int a=0;
        int i=0;
        int[] ans=new int[num_people];
        while(candies>0){
            a=a+1;
            if(candies<a){
                ans[i]+=candies;
            }else{
                ans[i]+=a;
            }
            candies=candies-a;
            i=(i+1)%(num_people);
        }
        return ans;
    }
}