class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> withOut = new HashSet<>();
        for (int num : nums) {
            withOut.add(num);
        }
        if (withOut.size() < 3) {
            return Collections.max(withOut);
        }

        withOut.remove(Collections.max(withOut));
        withOut.remove(Collections.max(withOut));

        return Collections.max(withOut);

    }
}