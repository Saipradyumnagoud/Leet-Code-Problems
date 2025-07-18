class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int count=0;
        int i=0;
        int n=word.length();
        while(i+k-1<word.length()-1){
            count++;
            if(word.substring(i+k,n).equals(word.substring(0,n-(i+k)))) {
                return count;
            }
            i+=k;
        }
        return count+1;
    }
}