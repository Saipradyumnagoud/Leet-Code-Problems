class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1){
            return true;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(String word : words){
            for(int i=0;i<word.length();i++){
                char c=word.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        int n=words.length;
        for(int count : map.values()){
            if(count%n != 0){
                return false;
            }
        }
        return true;
    }
}