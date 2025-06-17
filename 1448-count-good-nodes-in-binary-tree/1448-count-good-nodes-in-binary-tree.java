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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);

        
    }
    public int dfs(TreeNode node,int max)
    {
        if(node == null)
        {
            return 0;
        }
        int res;
        if(node.val>= max)
        {
            res = 1;
        }
        else{
            res = 0;
        }
        max = Math.max(node.val,max);
        res = res + dfs(node.left,max);
        res = res + dfs(node.right,max);
        return res;
        

    }
}