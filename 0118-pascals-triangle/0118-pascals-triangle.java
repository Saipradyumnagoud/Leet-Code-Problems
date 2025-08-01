class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for(int ro=1;ro<numRows;ro++){
            List<Integer> prev=result.get(ro-1);
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int i=1;i<ro;i++){
                curr.add(prev.get(i-1)+prev.get(i));
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}