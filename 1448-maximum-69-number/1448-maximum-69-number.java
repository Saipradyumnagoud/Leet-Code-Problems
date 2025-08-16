class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='6'){
                ch[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(ch));
    }
}