class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vowelsmap = new HashMap<>();
        Map<Character, Integer> consomap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsmap.put(c, vowelsmap.getOrDefault(c, 0) + 1);
            } else {
                consomap.put(c, consomap.getOrDefault(c, 0) + 1);
            }
        }
        int vowelsMax = 0, consonantMax = 0;

        for (int num : vowelsmap.values()) {
            vowelsMax = Math.max(vowelsMax, num);
        }

        for (int num : consomap.values()) {
            consonantMax = Math.max(consonantMax, num);
        }

        return consonantMax + vowelsMax;
    }
}