class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSize = sum(aliceSizes);
        int bobSize = sum(bobSizes);
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                int alice = aliceSizes[i];
                int bob = bobSizes[j];
                aliceSizes[i] = bob;
                bobSizes[j] = alice;

                if (aliceSize - alice + bob == bobSize - bob + alice)
                    return new int[] { alice, bob };
                else {
                    aliceSizes[i] = alice;
                    bobSizes[j] = bob;
                }
            }
        }
        return null;
    }

    public int sum(int arr[]) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }
}