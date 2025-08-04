class Solution {
    public int totalFruit(int[] fruits) {
        int max=0;
        int left=0;
        int right=0;
        Map<Integer,Integer> ba=new HashMap<>();
        for(right =0 ;right<fruits.length;right++){
            ba.put(fruits[right],ba.getOrDefault(fruits[right],0)+1);
            while(ba.size()>2){
                ba.put(fruits[left],ba.get(fruits[left])-1);
                if(ba.get(fruits[left])==0){
                    ba.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}