class Solution {
    public boolean isHappy(int n) {
        while(n>6){
      int a=n;
      int sum=0;
      while(a!=0){
        sum=sum+(a%10)*(a%10);
        a=a/10;
      }
      n=sum;
    }
    if(n==1){
      return true;
    }
      return false;
    }
}