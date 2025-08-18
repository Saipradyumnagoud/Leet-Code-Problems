class Solution {
    public String reverseOnlyLetters(String s) {
        List<Integer> dashes=new ArrayList<>();
        StringBuilder letter=new StringBuilder();
        for(char c :s.toCharArray()){
            if(Character.isLetter(c)){
                letter.append(c);
            }
        }
        letter.reverse();
        int indx=0;
        StringBuilder res=new StringBuilder();
        int letterInd=0,dashind=0;
        for(char c :s.toCharArray()){
            if(Character.isLetter(c)){
                res.append(letter.charAt(indx++));
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}