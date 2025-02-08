class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> wordcount = new HashMap<>();
        for (String word : (s1 + " " + s2).split(" ")) {
            wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (String word : wordcount.keySet()) {
            if (wordcount.get(word) == 1) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}