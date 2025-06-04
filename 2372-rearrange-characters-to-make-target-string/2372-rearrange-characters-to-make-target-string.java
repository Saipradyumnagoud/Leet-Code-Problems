class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> targetFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : target.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }
        int count = Integer.MAX_VALUE;
        for (char ch : target.toCharArray()) {
            if(!map.containsKey(ch)){
                return 0;
            }
            if (map.containsKey(ch)) {
                int available = map.get(ch);
                int needed = targetFreq.get(ch);
                count = Math.min(count, available / needed);
            }
        }
        return count;
    }
}