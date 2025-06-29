class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> wordmap1 = new HashMap<>();
        for (String word : words1) {
            wordmap1.put(word, wordmap1.getOrDefault(word, 0) + 1);
        }
        Map<String, Integer> wordmap2 = new HashMap<>();
        for (String word : words2) {
            wordmap2.put(word, wordmap2.getOrDefault(word, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : wordmap1.entrySet()) {
            if (entry.getValue() == 1) {
                if (wordmap2.containsKey(entry.getKey()) && wordmap2.get(entry.getKey()) == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}