class Solution {
    public int findSpecialInteger(int[] arr) {
        int occur=arr.length/4;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : map.keySet()){
            if(map.get(num)>occur){
                return num;
            }
        }
        return 0;
    }
}