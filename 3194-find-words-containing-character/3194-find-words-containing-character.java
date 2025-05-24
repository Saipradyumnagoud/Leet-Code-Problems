class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> anslist=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(findwordfreq(words[i],x)){
                anslist.add(i);
            }
        }
        return anslist;
    }
    public static boolean findwordfreq(String word,char x){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==x){
                return true;
            }
        }
        return false;
    }
}