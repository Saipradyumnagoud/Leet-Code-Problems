class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : map.values()){
            if(checkPrime(num)){
                return true;
            }
        }
        return false;
    }

    public boolean checkPrime(int n) {
        if (n <= 1)
            return false; 
        if (n == 2)
            return true; 
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}