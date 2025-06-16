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
    public List<Integer> rightSideView(TreeNode root) {
      Queue<TreeNode> q = new LinkedList<>();
      List<Integer> res = new ArrayList<>();

      q.offer(root);
      while(!q.isEmpty())
      { 
        TreeNode right = null;
        int len = q.size();
        for(int i = 0;i<len;i++)
        {
            TreeNode node = q.remove();
            if(node != null)
            {
                right = node;
                q.add(node.left);
                q.add(node.right);
            }
        }
        if(right!= null )
        {
            res.add(right.val);
        }
        
      }
      return res;
 
  
        
    }
}