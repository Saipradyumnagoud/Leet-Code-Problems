class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> required = new HashMap<>();
        required.put('b', 1);
        required.put('a', 1);
        required.put('l', 2);
        required.put('o', 2);
        required.put('n', 1);
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : text.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        int maxBalloons = Integer.MAX_VALUE;
        for (char c : required.keySet()) {
            int requiredCount = required.get(c);
            int availableCount = count.getOrDefault(c, 0);
            maxBalloons = Math.min(maxBalloons, availableCount / requiredCount);
        }

        return maxBalloons;
    }
}