class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        String ans = "";
        int count = 0;
        for (String num : arr) {
            if (map.get(num) == 1) {
                ans = num;
                count++;
            }
            if (count == k) {
                return ans;
            }
        }
        return "";
    }
}