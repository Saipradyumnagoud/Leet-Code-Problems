class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        // List<Integer> pairs = new ArrayList<>();
        // for (int i = 0; i < nums1.length; i++) {
        // for (int j = 0; j < nums2.length; j++) {
        // pairs.add(nums1[i] ^ nums2[j]);
        // }
        // }
        // int result = 0;
        // for (int num : pairs) {
        // result ^= num;
        // }
        // return result;
        int xor1 = 0, xor2 = 0;
        for (int num : nums1) {
            xor1 ^= num;
        }
        for (int num : nums2) {
            xor2 ^= num;
        }

        return ((nums1.length % 2 == 0) ? 0 : xor2) ^ ((nums2.length % 2 == 0) ? 0 : xor1);

    }
}