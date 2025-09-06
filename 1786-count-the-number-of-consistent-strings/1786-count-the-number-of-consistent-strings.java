class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> all=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            all.add(allowed.charAt(i));
        }
        int count=0;
        for(String word : words){
            boolean isConsistent=true;
            for(int j=0;j<word.length();j++){
                if(!all.contains(word.charAt(j))){
                    isConsistent=false;
                    break;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
}