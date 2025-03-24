class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int freeDays = days;
        int lastEnd = 0;

        for (int[] meeting : meetings) {
            int start = Math.max(meeting[0], lastEnd + 1);
            int end = meeting[1];

            if (start <= end) {
                freeDays -= (end - start + 1);
                lastEnd = end;
            }
        }

        return freeDays;
    }
}