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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null ||(root.left==null && root.right==null)){
            return -1;
        }
        int leftvalue=root.left.val;
        int rightvalue=root.right.val;
        if(leftvalue==root.val){
            leftvalue=findSecondMinimumValue(root.left);
        }
        if(rightvalue==root.val){
            rightvalue=findSecondMinimumValue(root.right);
        }
        if(leftvalue!=-1 && rightvalue!=-1){
            return Math.min(leftvalue,rightvalue);
        }else if(leftvalue!=-1){
            return leftvalue;
        }else{
            return rightvalue;
        }
    }
}