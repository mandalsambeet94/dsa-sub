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
    public int maxDepth(TreeNode root) {

        if( root == null){
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int count = 0;

        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            while(size > 0) {
                if(q.peek().left != null) {
                q.add(q.peek().left);
            }
            if(q.peek().right != null) {
                q.add(q.peek().right);
            }
            q.poll();
            size--;
            }
            count+=1;
        }
        return count;
    }
}
