class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // int row=Integer.MAX_VALUE;
        // for(int i=0;i<nums1.length;i++){
        // if(row<nums[i][0]){
        // max=nums[i][0];
        // }
        // }
        // for(int i=0;i<nums2.length;i++){
        // if(row<nums[i][0]){
        // max=nums[i][0];
        // }
        // }

        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] num : nums1) {
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }
        for (int[] num : nums2) {
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }
        int[][] result = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();
            i++;
        }

        return result;
    }
}