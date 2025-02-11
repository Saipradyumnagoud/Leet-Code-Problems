class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder s1 = new StringBuilder(s);
        while (s1.indexOf(part) != -1) {
            int index = s1.indexOf(part);
            s1.delete(index, index + part.length());
        }
        return s1.toString();
    }
}