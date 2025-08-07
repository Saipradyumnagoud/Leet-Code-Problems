class Node{
    Node[] child;
    boolean eow;
    public Node(){
        child = new Node[26];
        eow=false;
    }
}

class Solution {
    Node root=new Node();
    public void insert(String word){
        
        Node node=root;
        int n=word.length();
        for(int i=0;i<n;i++){
            int idx=word.charAt(i)-'a';
            if(node.child[idx]==null){
                node.child[idx]=new Node();
            }
            node=node.child[idx];
        }
        node.eow=true;
    }



    public String longestCommonPrefix(String[] strs) {
        for(String word : strs){
            if(word.length()==0){
                return "";
            }
            insert(word);
        }
        StringBuilder result=new StringBuilder();
        Node node=root;
        while(node!=null){
            int childCount=0;
            int index=-1;
            for(int i=0;i<26;i++){
                if(node.child[i]!=null){
                    childCount++;
                    index=i;
                }
            }
            if(childCount==1 && node.child[index]!=null){
                result.append((char)(index+'a'));
                node=node.child[index];
            }else{
                break;
            }
        }
        return result.toString();
    }
}