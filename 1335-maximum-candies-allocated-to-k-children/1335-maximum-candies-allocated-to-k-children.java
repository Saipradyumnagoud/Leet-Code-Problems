class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum=0;
        for(int candie:candies){
            sum+=candie;
        }
        if(sum<k){
            return 0;
        }
        long low = 1, high = sum / k;
        while(low<=high){
            long mid = low+(high-low)/2;
            long count =0;
            for(int candie : candies){
                count+=candie/mid;
            }
            if(count>=k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)high;
    }
}