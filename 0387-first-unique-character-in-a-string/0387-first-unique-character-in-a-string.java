class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        char st[] = s.toCharArray();
        for (char c : st) {
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < st.length; i++) {
            if (hashmap.get(st[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}