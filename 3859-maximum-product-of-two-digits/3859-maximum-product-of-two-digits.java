class Solution {
    public int maxProduct(int s) {
        String num=Integer.toString(s);
        int[] digits=new int[num.length()];
        for(int i=0;i<num.length();i++){
            digits[i]=Character.getNumericValue(num.charAt(i));
        }
        int max=0;
        for(int i=0;i<digits.length;i++){
            for(int j=i+1;j<digits.length;j++){
                max=Math.max(max , digits[i]*digits[j]);
            }
        }
        return max;
    }
}