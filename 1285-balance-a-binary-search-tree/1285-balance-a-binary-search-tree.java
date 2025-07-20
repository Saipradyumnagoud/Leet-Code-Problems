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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        inOrderTraversal(root,inorder);
        return buildBalanced(inorder,0,inorder.size()-1);
    }
    public static void inOrderTraversal(TreeNode root,List<Integer> list){
        if(root==null){
            return ;
        }
        inOrderTraversal(root.left,list);
        list.add(root.val);
        inOrderTraversal(root.right,list);
 
    }


    public static TreeNode buildBalanced(List<Integer> list,int start,int end){
        if(start>end) return null;

        int mid=start+(end-start)/2;
        TreeNode node=new TreeNode(list.get(mid));
        node.left=buildBalanced(list,start,mid-1);
        node.right=buildBalanced(list,mid+1,end);
        return node;
    }
}