class Solution {
    public String sortVowels(String s) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> vowelList = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c))
                vowelList.add(c);
        }
        Collections.sort(vowelList);
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                sb.append(vowelList.get(idx++));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}