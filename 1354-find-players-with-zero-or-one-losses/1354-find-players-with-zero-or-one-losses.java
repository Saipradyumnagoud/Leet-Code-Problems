class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> winnersset = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {

            winnersset.add(matches[i][0]);
            map.put(matches[i][1], map.getOrDefault(matches[i][1], 0) + 1);

        }
        List<Integer> winners = new ArrayList<>();
        for (int num : winnersset) {
            if (!map.containsKey(num)) {
                winners.add(num);
            }
        }
        Collections.sort(winners);

        List<Integer> loosers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                loosers.add(entry.getKey());
            }
        }
        Collections.sort(loosers);
        result.add(winners);
        result.add(loosers);
        return result;
    }
}