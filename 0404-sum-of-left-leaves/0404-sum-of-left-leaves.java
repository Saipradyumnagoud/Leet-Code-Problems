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
    public int sumOfLeftLeaves(TreeNode root) {
        // if(root==null){
        //     return 0;
        // }
        // Queue<TreeNode> queue=new LinkedList<>();
        // queue.offer(root);
        // int sum=0;
        // while(!queue.isEmpty()){
        //     TreeNode curr=queue.poll();
        //     if(curr.left!=null){
        //         if(curr.left.left==null && curr.left.right==null){
        //             sum+=curr.left.val;
        //         }else{
        //             queue.offer(curr.left);
        //         }
        //     }
        //     if(curr.right!=null){
        //         queue.offer(curr.right);
        //     }
        // }
        // return sum;

        if(root==null) {
            return 0;
        }
        return leftsum(root,false);
    }
    public int leftsum(TreeNode node,boolean isleft){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return isleft ? node.val : 0;
        }
        int leftsum=leftsum(node.left,true);
        int rightsum=leftsum(node.right,false);
        return leftsum+rightsum;
    }
}