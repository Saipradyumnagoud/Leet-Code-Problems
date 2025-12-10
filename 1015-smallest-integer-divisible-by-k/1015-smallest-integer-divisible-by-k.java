class Solution {
    public int smallestRepunitDivByK(int k) {
        if(1%k==0){
            return 1;
        }
        if(k%2==0 || k%5==0){
            return -1;
        }
        int num=1;
        for(int i=2;i<k+1;i++){
            num=((num*10)+1)%k;
            if(num==0){
                return i;
            }
        }
        return -1;
    }
}