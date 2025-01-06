class Solution {
    public String baseNeg2(int n) {
        // String binary=Integer.toBinaryString(n);
        // return binary;
        if (n == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int remainder = n % -2;
            n = n / -2;
            if (remainder < 0) {
                remainder += 2;
                n += 1;
            }
            result.insert(0, remainder);
        }
        return result.toString();
    }
}