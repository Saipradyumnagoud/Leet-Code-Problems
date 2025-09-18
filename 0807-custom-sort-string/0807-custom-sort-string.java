class Solution {
    public String customSortString(String order, String s) {
        int[] freq=new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder result=new StringBuilder();
        for(char c : order.toCharArray()){
            while(freq[c-'a']>0){
                if(s.indexOf(c)!=-1){
                    result.append(c);
                    freq[c-'a']--;
                }
            }
        }
        for(char c : s.toCharArray()){
            while(freq[c-'a']>0){
                result.append(c);
                freq[c-'a']--;
            }
        }
        return result.toString();
    }
}