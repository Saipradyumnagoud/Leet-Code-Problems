class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int total=0;
        for(int i=0;i<boxTypes.length;i++){
            int box=Math.min(truckSize,boxTypes[i][0]);
            total+=box*boxTypes[i][1];
            truckSize-=box;
        }
        return total;
    }
}