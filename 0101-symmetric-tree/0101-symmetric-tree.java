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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levesize = queue.size();
            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < levesize; i++) {
                TreeNode curr = queue.poll();
                if (curr == null) {
                    nums.add(null);
                    queue.offer(null); 
                    queue.offer(null);
                } else {
                    nums.add(curr.val);
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
            if (!ListSymmetric(nums)) {
                return false;
            }
            boolean allNull = true;
            for (TreeNode node : queue) {
                if (node != null) {
                    allNull = false;
                    break;
                }
            }
            if (allNull) break;
        }
        return true;
    }

    public boolean ListSymmetric(List<Integer> nums) {
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            if (nums.get(left) == null && nums.get(right) == null) {
                left++;
                right--;
                continue;
            }
            if (nums.get(left) == null || nums.get(right) == null) return false;
            if (!nums.get(left).equals(nums.get(right))) return false;
            left++;
            right--;
        }

        return true;
    }
}