class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for(int num : arr1){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[arr1.length];
        int index = 0;
        
        for (int num : arr2) {
            int freq = freqMap.getOrDefault(num, 0);
            while (freq-- > 0) {
                ans[index++] = num;
            }
            freqMap.remove(num);
        }
        List<Integer> remaining=new ArrayList<>();
        for(int num : freqMap.keySet()){
            int count=freqMap.get(num);
            while(count-- > 0){
                remaining.add(num);
            }
        }
        Collections.sort(remaining);
        for(int num : remaining){
            ans[index++]=num;
        }
        return ans;
    }
}