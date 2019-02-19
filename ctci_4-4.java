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
    public boolean isBalanced(TreeNode root) {
       return treeHeight(root)!=Integer.MIN_VALUE; 
    }
    public int treeHeight(TreeNode root)
    {
        if(root==null)
            return -1;
        int leftHeight = treeHeight(root.left);
        if(leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int rightHeight = treeHeight(root.right);
        if(rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int diff = leftHeight - rightHeight;
        if(Math.abs(diff)>1)
            return Integer.MIN_VALUE;
        else
            return Math.max(leftHeight,rightHeight)+1;
    }
}