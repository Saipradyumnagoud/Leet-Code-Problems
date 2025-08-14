class Solution {
    public String largestGoodInteger(String num) {
        int max=Integer.MIN_VALUE;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<num.length()-2;i++){
            char c=num.charAt(i);
            char cnext=num.charAt(i+1);
            char cnext2=num.charAt(i+2);
            if(c==cnext && c==cnext2){
                int n=c-'0';
                max=Math.max(n,max);
            }
        }
        if(max==Integer.MIN_VALUE){
            return "";
        }
        else{
            str.append(Integer.toString(max));
            str.append(Integer.toString(max));
            str.append(Integer.toString(max));
            
        }
        return str.toString();
    }
}