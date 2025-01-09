class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String word:words){
            boolean isprefix=true;
            for(int i=0;i<pref.length();i++){
                if(i>=word.length() || word.charAt(i)!=pref.charAt(i)){
                    isprefix=false;
                    break;
                }
            }
            if(isprefix){
                count++;
            }
        }
        return count;
    }
}