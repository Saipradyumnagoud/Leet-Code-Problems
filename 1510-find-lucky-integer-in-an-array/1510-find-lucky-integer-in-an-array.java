class Solution {
    public int findLucky(int[] arr) {
        int[] number=new int[501];
        for(int j:arr){
            number[j]++;
        }
        for(int i=500;i>0;i--){
            if(i==number[i]){
                return i;
            }
        }
        return -1;
    }
}