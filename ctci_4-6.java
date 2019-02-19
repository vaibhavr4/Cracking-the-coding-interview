public TreeNode inorderSuccessor(TreeNode node)
{
	if(node==null) return null;
	if(node.right!=null)
		return leftMostChild(node);
	else
	{
		TreeNode curr = node;
		TreeNode par = node.parent;
		while(par!=null && par.left!=curr)
		{
			curr = par;
			par = par.parent;
		}
		return par;
	}
		
}
public TreeNode leftMostChild(TreeNode node)
{
	if(node==null)
		return null;
	while(node.left!=null)
		node = node.left;
	return node;
		
}