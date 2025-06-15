class Solution {
    public int maxDiff(int num) {
        String str = String.valueOf(num);
        char firstmin = ' ';
        for (char c : str.toCharArray()) {
            if (c != '9') {
                firstmin = c;
                break;
            }
        }
        String maxnumber = str.replace(firstmin, '9');
        char firstmax = str.charAt(0);
        int count = 0;
        if (firstmax == '1') {
            for (char c : str.toCharArray()) {
                if (c != '0' && c != '1') {
                    firstmax = c;
                    count++;
                    break;
                }
            }
        }
        String minnumber = str;
        if (count > 0) {
            minnumber = str.replace(firstmax, '0');
        } else {
            minnumber = str.replace(firstmax, '1');
        }
        return Integer.parseInt(maxnumber) - Integer.parseInt(minnumber);
    }
}