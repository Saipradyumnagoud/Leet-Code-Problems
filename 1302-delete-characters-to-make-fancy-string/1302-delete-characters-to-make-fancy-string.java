class Solution {
    public String makeFancyString(String s) {
        StringBuilder result=new StringBuilder();
        int freq=1;
        char prev=s.charAt(0);
        result.append(prev);

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==prev){
                freq++;
            }else{
                prev=s.charAt(i);
                freq=1;
            }
            if(freq<3) result.append(s.charAt(i));
        }



        return result.toString();
    }
}