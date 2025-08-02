class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int n = basket1.length;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            map1.put(basket1[i], map1.getOrDefault(basket1[i], 0) + 1);
            map2.put(basket2[i], map2.getOrDefault(basket2[i], 0) + 1);
            minVal = Math.min(minVal, basket1[i]);
            minVal = Math.min(minVal, basket2[i]);
        }
        List<Integer> swap1 = new ArrayList<>();
        for (int key : map1.keySet()) {
            int c1 = map1.get(key);
            int c2 = map2.getOrDefault(key, 0);
            if ((c1 + c2) % 2 == 1) {
                return -1;
            }
            if (c1 > c2) {
                int add = (c1 - c2) / 2;
                while (add-- > 0) {
                    swap1.add(key);
                }
            }
        }
        List<Integer> swap2 = new ArrayList<>();
        for (int key : map2.keySet()) {
            int c1 = map1.getOrDefault(key, 0);
            int c2 = map2.get(key);
            if ((c1 + c2) % 2 == 1) {
                return -1;
            }
            if (c2 > c1) {
                int add = (c2 - c1) / 2;
                while (add-- > 0) {
                    swap2.add(key);
                }
            }
        }
        Collections.sort(swap1);
        Collections.sort(swap2, (a, b) -> b - a);
        long res = 0;
        for (int i = 0; i < swap1.size(); i++) {
            res += Math.min(2 * minVal, Math.min(swap1.get(i), swap2.get(i)));
        }
        return res;

    }
}