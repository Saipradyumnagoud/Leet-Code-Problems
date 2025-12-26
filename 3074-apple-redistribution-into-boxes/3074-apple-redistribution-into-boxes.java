class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        for(int a : apple){
            sum+=a;
        }
        int count=0;
        for(int i=capacity.length-1;i>=0;i--){
            if(sum>0){
                sum=sum-capacity[i];
                count++;
            }
        }
        return count;
    }
}