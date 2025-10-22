class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result=0;
        for(int i : map.keySet()){
            if(map.get(i)==1){
                return -1;
            }
            int count=map.get(i);
            if(count % 3==0){
                result+=count/3;
            }else if(count %3 ==1){
                result+=(count-4)/3+2;
            }else {
                result+=count/3+1;

            }
            
        }
        return result;
    }
}