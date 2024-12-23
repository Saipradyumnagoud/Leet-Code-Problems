class Solution {
    public boolean checkRecord(String s) {
        char[] arr=s.toCharArray();
        int absent=0;
        int late=0;
        int present=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='A'){
                absent++;
            }else if (i > 1 && arr[i] == 'L' && arr[i - 1] == 'L' && arr[i - 2] == 'L') {
                return false;
            }else{
                present++;
            }
        }
        if(absent<2){
            return true;
        }
        return false;
    }
}