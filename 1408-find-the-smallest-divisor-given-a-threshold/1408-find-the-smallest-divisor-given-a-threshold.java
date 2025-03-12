class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // int maxnumber = 0;
        // for (int num : nums) {
        // maxnumber = Math.max(num, maxnumber);
        // }
        // for (int i = 1; i <= maxnumber; i++) {
        // int sum = 0;
        // for (int num : nums) {
        // sum += Math.ceil((double) num / i);
        // }
        // if (sum <= threshold) {
        // return i;
        // }
        // }
        // return -1;
        int low = 1, high = 0;
        for (int num : nums) {
            high = Math.max(num, high);
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (getsum(nums, mid) <= threshold) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int getsum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / divisor);
        }
        return sum;
    }
}