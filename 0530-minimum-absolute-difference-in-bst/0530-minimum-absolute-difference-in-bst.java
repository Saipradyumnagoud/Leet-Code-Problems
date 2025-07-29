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
    public int getMinimumDifference(TreeNode root) {
        int minValue=Integer.MAX_VALUE;
        List<Integer> nums=new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode curr=queue.poll();
            nums.add(curr.val);
            if(curr.left!=null){
                queue.offer(curr.left);
            }
            if(curr.right!=null){
                
                queue.offer(curr.right);
            }
        }
        Collections.sort(nums);
        for(int i=1;i<nums.size();i++){
            minValue=Math.min(minValue,Math.abs(nums.get(i)-nums.get(i-1)));
        }
        return minValue;
    }
}