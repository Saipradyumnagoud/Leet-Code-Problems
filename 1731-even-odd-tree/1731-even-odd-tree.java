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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        boolean result = false;
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> currlevelist = new ArrayList<>();
            for (int i = 0; i < levelsize; i++) {
                TreeNode curr = queue.poll();
                currlevelist.add(curr.val);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            if (!checkboolean(currlevelist, level)) {
                return false;
            }
            level++;
        }
        return true;
    }

    public boolean checkboolean(List<Integer> currLevelList, int level) {
        if (currLevelList.isEmpty())
            return true;
        if (level % 2 == 0) {
            int prev = Integer.MIN_VALUE;
            for (int curr : currLevelList) {
                if (curr % 2 == 0 || curr <= prev) {
                    return false;
                }
                prev = curr;
            }
        } else {
            int prev = Integer.MAX_VALUE;
            for (int curr : currLevelList) {
                if (curr % 2 != 0 || curr >= prev) {
                    return false;
                }

                prev = curr;
            }
        }
        return true;
    }

}