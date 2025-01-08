class Solution {
    public int maximum69Number (int num) {
        char arr[] = String.valueOf(num).toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                int newnumber=Integer.parseInt(new String(arr));
                if(newnumber>num){
                    break;
                }
            }
        }
        return Integer.parseInt(new String(arr));
    }
}