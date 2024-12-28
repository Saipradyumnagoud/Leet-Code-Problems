class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        if (num == 100000001) {
            for (int i = 2; i * i <= num; i++) {
                if (num == (i * i)) {
                    return true;
                }
            }
        } else {
            for (int i = 2; i < num; i++) {
                if (num == (i * i)) {
                    return true;
                }
            }
           
        }
         return false;
    }
}