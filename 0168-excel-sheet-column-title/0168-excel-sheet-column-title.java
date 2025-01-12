class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
        while(columnNumber >0){
            columnNumber--;
            char current=(char)(columnNumber%26+'A');
            result.insert(0,current);
            columnNumber/=26;
        }
        return result.toString();
    }
}