class Solution {
    public int minMaxDifference(int num) {
        String str=String.valueOf(num);
        char c=' ';
        for( char ch : str.toCharArray()){
            if(ch!='9'){
                c=ch;
                break;
            }
        }
        String maxnumber=str.replace(c, '9');
        char a=str.charAt(0);
        String minnumber=str.replace(a,'0');
        return Integer.parseInt(maxnumber)-Integer.parseInt(minnumber);
        
    }
}