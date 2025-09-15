class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count=0;
        for(String word : words){
            boolean iscan=true;
            for(char ch : brokenLetters.toCharArray()){
                if(word.indexOf(ch)!=-1){
                    iscan=false;
                    break;
                }
            }
            if(iscan){
                count++;
            }
        }
        return count;
    }
}