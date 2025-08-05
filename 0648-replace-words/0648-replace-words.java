class Node {
    Node[] children;
    boolean eow;

    public Node() {
        children = new Node[26];
        eow = false;
    }
}



class Solution {
    Node root=new Node();
    public void insert(String word){
        Node node=root;
        int n=word.length();
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(node.children[idx]==null){
                node.children[idx]=new Node();
            }
            node=node.children[idx];
        }
        node.eow=true;
    }

    public int search(String word){
        Node node=root;
        int n=word.length();
        for(int i=0;i<n;i++){
            int idx=word.charAt(i)-'a';
            if(node.children[idx]==null){
                return -1;
            }
            node=node.children[idx];
            if(node.eow){
                return i;
            }
        }
        return -1;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        for(String word : dictionary){
            insert(word);
        }
        String[] words=sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            int idx=search(word);
            if(idx==-1){
                result.append(word);
            }else{
                result.append(word,0,idx+1);
            }
            result.append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}