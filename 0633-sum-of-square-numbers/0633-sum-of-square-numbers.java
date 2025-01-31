class Solution {
    public boolean judgeSquareSum(int c) {
        // if (c == 1 || c == 0) {
        //     return true;
        // }
        // for (int i = 0; i < c; i++) {
        //     for (int j = 1; j < c; j++) {
        //         if ((i * i) + (j * j) == c) {
        //             return true;

        //         }
        //     }
        // }
        // return false;
        if (c < 0) return false;
        int max = (int) Math.sqrt(c);
        for(int i=0;i<=max;i++){
            int j=(int)Math.sqrt(c-i*i);
            if(i * i + j * j == c){
                return true;
            }
        }
        return false;
    }
}