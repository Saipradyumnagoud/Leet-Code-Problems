class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] ch=s.toCharArray();
        int n=s.length();
        int totalshift=0;
        for(int i=n-1;i>=0;i--){
            totalshift=(totalshift+shifts[i])%26;
            ch[i]=(char)('a'+(ch[i]-'a'+totalshift)%26);
        }
        return new String(ch);
    }
}