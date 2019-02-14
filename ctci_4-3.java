public ArrayList<LinkedList<Node>> listDepth(Node root)
{
	ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
	LinkedList<Node> curr = new LinkedList<Node>();
	if(root!=null)
		current.add(root);
	while(current.size()>0)
	{
		result.add(current);
		LinkedList<Node> parent = current;
		current = new LinkedList<Node>();
		for(node:parent)
		{
			if(node.left!=null)
				current.add(node.left);
			if(node.right!=null)
				current.add(node.right);
		}
	}
	return result;
}