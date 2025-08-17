class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> seen=new HashSet<>();
        char c=s.charAt(0);
        for(char ch : s.toCharArray()){
            if(seen.contains(ch)){
                c=ch;
                break;
            }
            seen.add(ch);
        }
        return c;
    }
}