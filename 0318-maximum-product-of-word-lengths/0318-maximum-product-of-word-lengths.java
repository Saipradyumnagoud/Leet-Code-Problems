class Solution {
    public int maxProduct(String[] words) {
        int maxvalue=0;
        for(int i=0;i<words.length;i++){
            for(int j=i;j<words.length;j++){
                if(checkisCommon(words[i],words[j])){
                    maxvalue=Math.max(words[i].length()*words[j].length(),maxvalue);
                }
            }
        }
        return maxvalue;
    }
    public boolean checkisCommon(String word1,String word2){
        boolean[] seen=new boolean[26];
        for(char c : word1.toCharArray()){
            seen[c-'a']=true;
        }
        for(char c : word2.toCharArray()){
            if(seen[c-'a']){
                return false;
            }
        }
        return true;
    }
}