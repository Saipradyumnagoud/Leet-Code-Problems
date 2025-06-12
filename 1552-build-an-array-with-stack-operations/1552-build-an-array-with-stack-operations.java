class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for(int i=1;i<=n;i++){
            stack.push(i);
            ans.add("Push");
            if(j<target.length && stack.peek()==target[j]){
                j++;
            }else{
                stack.pop();
                ans.add("Pop");
            }
            if (j == target.length) break;
        }
        return ans;
    }
}