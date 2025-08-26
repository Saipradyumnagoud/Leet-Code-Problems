class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area=0;
        double prevLength=0;
        for(int i=0;i<dimensions.length;i++){
            double length=(double)Math.sqrt(((dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1])));
            int currArea=dimensions[i][0]*dimensions[i][1];
            if(length>prevLength){
                prevLength=length;
                area=currArea;
            }else if(length==prevLength){
                area=Math.max(area,currArea);
            }
        }
        return area;
    }
}