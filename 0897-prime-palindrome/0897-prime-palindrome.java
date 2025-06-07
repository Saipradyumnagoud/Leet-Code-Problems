class Solution {
    public int primePalindrome(int n) {
        int num=n;
     while(n>0){
         if(isprime(num) && ispalindrome(num)){
             return num;
         }
             num++;
              if (num > 10_000_000 && num< 100_000_000) {
            num = 100_000_000; 
            }
     }
     return num;
    }

    public boolean isprime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public boolean ispalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;

    }
}