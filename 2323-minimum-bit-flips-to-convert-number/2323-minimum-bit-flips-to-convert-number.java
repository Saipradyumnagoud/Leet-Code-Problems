class Solution {
    public int minBitFlips(int start, int goal) {
        String startbits=Integer.toBinaryString(start);
        String goalbits=Integer.toBinaryString(goal);
        int maxLength = Math.max(startbits.length(), goalbits.length());
        int count=0;
        startbits = String.format("%" + maxLength + "s", startbits).replace(' ', '0');
        goalbits = String.format("%" + maxLength + "s", goalbits).replace(' ', '0');
        for(int i=0;i<maxLength;i++){
            if(startbits.charAt(i)!=goalbits.charAt(i)){
                count++;
            }
        }
        return count;
    }
}