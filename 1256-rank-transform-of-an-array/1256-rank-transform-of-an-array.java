class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> nums = new HashSet<>();
        for (int ar : arr) {
            nums.add(ar);
        }
        List<Integer> sortedList = new ArrayList<>(nums);
        Collections.sort(sortedList);
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedList.size(); i++) {
            rankMap.put(sortedList.get(i), i+1);
        }
        int[] rank = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rank[i] = rankMap.get(arr[i]);
        }
        return rank;
    }
}