class Solution {
    public int bitwiseComplement(int n) {
        String binaryString=Integer.toBinaryString(n);
        StringBuilder complement=new StringBuilder();
        for(int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i)=='0'){
                complement.append('1');
            }
            else{
                complement.append('0');
            }
        }
        int number = Integer.parseInt(complement.toString(), 2);
        return number;
    }
}