class Solution {
    public String capitalizeTitle(String title) {
        String lowertitle = title.toLowerCase();
        String[] words = lowertitle.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String word : words) {
            if (word.length() > 2) {
                answer.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }else{
                answer.append(word).append(" ");
            }
        }
        return answer.toString().trim();
    }
}