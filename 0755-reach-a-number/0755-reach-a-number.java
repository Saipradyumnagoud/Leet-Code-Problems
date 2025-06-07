class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int count=0;
        int start=0;
        while(start<target || (start-target)%2!=0){
            count++;
            start+=count;
        }
        return count;
    }
}