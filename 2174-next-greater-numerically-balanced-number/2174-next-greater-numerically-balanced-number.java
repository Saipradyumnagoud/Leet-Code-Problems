class Solution {
    public int nextBeautifulNumber(int n) {
        int result = -1;
        int i=n+1;
        while (true) {
            if (isbeautiful(i)) {
                return i;
            }
            i++;
        }
    }

    public boolean isbeautiful(int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            freq.put(digit, freq.getOrDefault(digit, 0) + 1);
            temp /= 10;
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int digit = entry.getKey();
            int count = entry.getValue();

            if (digit != count) {
                return false;
            }
        }

        return true;
    }
}