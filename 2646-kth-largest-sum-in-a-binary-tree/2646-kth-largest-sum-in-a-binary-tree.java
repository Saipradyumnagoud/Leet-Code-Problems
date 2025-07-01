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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> sums=new ArrayList<>();
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Long> nums=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode curr=queue.poll();
                long value=(long)(curr.val);
                nums.add(value);
                if(curr.left!=null){
                    queue.offer(curr.left);
                }if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            long sum=0;
            for(long num : nums){
                sum+=num;
            }
            sums.add(sum);
        }
        Collections.sort(sums, Collections.reverseOrder());
        if(k>sums.size()){
            return -1;
        }
        return sums.get(k-1);
    }
}