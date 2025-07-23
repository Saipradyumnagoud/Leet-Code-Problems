/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<String> result=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return result;
        }
        build(root,"");
        return result;
    }
    public void build(TreeNode root,String path){
        if(root==null){ return; 
        }
        path+=root.val;
        if(root.left==null && root.right==null){
            result.add(path);
        }else{
            path+="->";
            build(root.left,path);
            build(root.right,path);
        }
    }
}