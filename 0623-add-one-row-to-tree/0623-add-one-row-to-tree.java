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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int currdepth=1;
        while(!queue.isEmpty()){
            int currSize=queue.size();
            if(currdepth==depth-1){
                for(int i=0;i<currSize;i++){
                    TreeNode curr=queue.poll();
                    TreeNode templeft=curr.left;
                    TreeNode tempRight=curr.right;
                    curr.left=new TreeNode(val);
                    curr.left.left=templeft;
                    curr.right=new TreeNode(val);
                    curr.right.right=tempRight;
                }
                break;
            }else{
                for(int i=0;i<currSize;i++){
                    TreeNode curr=queue.poll();
                    if(curr.left!=null){
                        queue.offer(curr.left);
                    }
                    if(curr.right!=null){
                        queue.offer(curr.right);
                    }
                    
                }
                currdepth++;
            }
        }
        return root;
    }
}