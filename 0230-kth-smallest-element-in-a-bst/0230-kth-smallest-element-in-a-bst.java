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

 // if(root==null){
        //     return 0;
        // }
        // Queue<TreeNode> queue=new LinkedList<>();
        // queue.offer(root);
        // List<Integer> nums=new ArrayList<>();
        // while(!queue.isEmpty()){
        //     int levelSize=queue.size();
        //     for(int i=0;i<levelSize;i++){
        //         TreeNode curr=queue.poll();
        //         nums.add(curr.val);
        //         if(curr.left!=null){
        //             queue.offer(curr.left);
        //         }
        //         if(curr.right!=null){
        //             queue.offer(curr.right);
        //         }
        //     }
        // }
        // Collections.sort(nums);
        // if(k>nums.size()){
        //     return -1;
        // }
        // return nums.get(k-1);
class Solution {
    int count=0;
    int result=-1;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return result;
    }
    public void inorder(TreeNode root,int k){
        if(root==null){
            return ;
        }
        inorder(root.left,k);
        count++;
        if(count==k){
            result=root.val;
            return;
        }
        inorder(root.right,k);
    }
}