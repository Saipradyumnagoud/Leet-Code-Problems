class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String,Integer> map=new HashMap<>();
        int maxocc=0;
        int left=0,right=minSize;
        while(right<=s.length()){
            String substr=s.substring(left,right);
            map.put(substr,map.getOrDefault(substr,0)+1);
            left++;
            right++;
        }
        for(String substr: map.keySet()){
            int count=map.get(substr);
            if(count>maxocc && isvalid(substr,maxLetters)){
                maxocc=count;
            }
        }
        return maxocc;
    }
    public boolean isvalid(String substr,int maxletters){
        HashSet<Character> count=new HashSet<>();
        for(int i=0;i<substr.length();i++){
            char c=substr.charAt(i);
            count.add(c);
        }
        return count.size()<=maxletters;
    }
}