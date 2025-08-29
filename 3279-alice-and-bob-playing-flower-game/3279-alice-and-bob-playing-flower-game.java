class Solution {
    public long flowerGame(int n, int m) {
        long oddsn=(n+1L)/2L;
        long evenm=m/2L;
        long count=oddsn*evenm;
        long evenn=n/2L;
        long oddsm=(m+1L)/2L;
        count+=evenn*oddsm;
        return count;
    }
}