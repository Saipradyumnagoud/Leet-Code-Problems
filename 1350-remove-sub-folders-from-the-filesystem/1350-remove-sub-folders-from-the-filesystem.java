class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans=new ArrayList<>();
        String prev=folder[0];
        ans.add(prev);
        for(int i=1;i<folder.length;i++){
            String curr=folder[i];
            if(!curr.startsWith(prev+"/")){
                ans.add(curr);
                prev=curr;
            }
        }
        return ans;
    }
}