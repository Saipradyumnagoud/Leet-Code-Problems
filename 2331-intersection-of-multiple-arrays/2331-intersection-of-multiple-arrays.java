class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }
        List<Integer> result=new ArrayList<>();
        int n=nums.length;
        for(int i : map.keySet()){
            if(map.get(i)/n ==1){
                result.add(i);
            }
        }
        Collections.sort(result);
        return result;
    }
}