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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> nums=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode curr=queue.poll();
                nums.add(curr.val);
                if(curr.left!=null){
                    queue.offer(curr.left);
                }if(curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            int value=maxvalue(nums);
            result.add(value);
        }
        return result;
    }

    public int maxvalue(List<Integer> nums){
        int max=Integer.MIN_VALUE;
        for(int num : nums){
            if(num> max){
                max=Math.max(num,max);
            }
        }
        return max;
    }
}