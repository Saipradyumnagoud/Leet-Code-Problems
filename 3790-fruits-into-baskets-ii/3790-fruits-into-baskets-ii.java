class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] seenbaskets = new boolean[baskets.length];
        Arrays.fill(seenbaskets,true);
        boolean[] seenfruits = new boolean[fruits.length];
        Arrays.fill(seenfruits,false);
        for(int i=0;i<fruits.length;i++){
            int fruit=fruits[i];
            for(int j=0;j<baskets.length;j++){
                if(fruit<=baskets[j] && seenbaskets[j]){
                    seenbaskets[j]=false;
                    seenfruits[i]=true;
                    break;
                }
            }
        }
        int count=0;
        for(int i=0;i<seenfruits.length;i++){
            if(!seenfruits[i]){
                count++;
            }
        }
        return count;
    }
}