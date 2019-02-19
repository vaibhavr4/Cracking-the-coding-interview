/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
       if(root==null)
           return true;
        return isBST(root,null,null);
    }
    public boolean isBST(TreeNode node, Integer min, Integer max)
    {
        if(min!=null && node.val<=min)
            return false;
        if(max!=null && node.val>=max)
            return false;
        boolean left = (node.left!=null)?isBST(node.left,min,node.val):true;
        if(left)
        {
            boolean right = (node.right!=null)?isBST(node.right,node.val,max):true;
            return right;
        }
        else
            return false;
    }
}