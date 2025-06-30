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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Double> currlevellist=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode curr=queue.poll();
                double value=(double)(curr.val);
                currlevellist.add(value);
                if(curr.left!=null){
                    queue.offer(curr.left);
                }if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            double sum=0;
            for(double num : currlevellist){
                sum+=num;
            }
            result.add(sum/levelsize);
        }
        return result;
    }
}