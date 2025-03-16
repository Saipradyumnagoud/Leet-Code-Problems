class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l=1,r=(long) 1e14;
        while(l<r){
            long mid=(l+r)/2;
            if(time(ranks,cars,mid)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean time(int[] ranks,int cars,long min){
        long carsdone=0;
        for(int r : ranks){
            long c2=min/r;
            long c=(long)Math.sqrt(c2);
            carsdone+=c;
        }
        return carsdone>=cars;
    }
}