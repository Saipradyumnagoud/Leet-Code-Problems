class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        for (int candy : candyType) {
            types.add(candy);
        }
        int candies = candyType.length / 2;
        if (types.size() == 1) {
            return 1;
        }
        if(types.size()<candies){
            return types.size();
        }
        return candies;
    }
}