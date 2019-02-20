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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        
        parent.put(root,null);
        stack.push(root);
        
        while(!parent.containsKey(p) || !parent.containsKey(q) )
        {
            TreeNode n = stack.pop();
            if(n.left!=null)
            {
                parent.put(n.left,n);
                stack.push(n.left);
            }
            if(n.right!=null)
            {
                parent.put(n.right,n);
                stack.push(n.right);
            }
        }
        
        Set<TreeNode> ancestor = new HashSet<>();
        while(p!=null)
        {
            ancestor.add(p);
            p = parent.get(p);
        }
        while(!ancestor.contains(q))
            q = parent.get(q);
        return q;
    }
}