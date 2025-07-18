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
    public boolean isValidBST(TreeNode root) {
    //     if(root == null)
    //     {
    //         return false;
    //     }
    //    if(root.left != null && root.left.val<root.val)
    //    {
    //     return true;
    //    }
    //     if(root.right != null && root.right.val>root.val)
    //    {
    //     return true;
    //    }
      

    //    return isValidBST(root.left) && isValidBST(root.right);
    return valid(root,Long.MIN_VALUE, Long.MAX_VALUE);

   
    }
     public boolean valid(TreeNode node,long min,long max)
    {
        if(node == null)
        {
            return true;
        }
        if(node.val <= min || node.val>= max)
        {
            return false;
        }
        return valid(node.left,min,node.val) && valid(node.right,node.val,max);
    }

}