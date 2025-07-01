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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse=false;
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> currlevel = new ArrayList<>();
            for (int i = 0; i < levelsize; i++) {
                TreeNode curr = queue.poll();
                currlevel.add(curr.val);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            if(!reverse){
                
                result.add(currlevel);
                reverse=true;
            }else{
                List<Integer> reversed = new ArrayList<>(currlevel);
                Collections.reverse(reversed);
                result.add(reversed);
                
                reverse=false;
            }
            
        }

        return result;
    }

}