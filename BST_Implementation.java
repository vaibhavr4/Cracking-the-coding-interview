import java.util.*;

public class BinarySearchTree
{
	public class Node
	{
	    int key;
	    Node left, right;
	    public Node(int key)
	    {
	        this.key = key;
	        left=right=null;
	    }
	   
	}
	     Node root;
	    public BinarySearchTree()
	    {
	        root = null;
	    }
	    
	    public void insert(int key)
	    {
	        root = insertRec(root,key);
	    }
	    
	    public Node insertRec(Node root, int key)
	    {
	        if(root == null)
	        {
	            root = new Node(key);
	            return root;
	        }
	        if(key<root.key)
	            root.left = insertRec(root.left, key);
	       else if(key > root.key)
	        root.right = insertRec(root.right,key);
	        
	        return root;
	        
	    }
	    
	    public void inOrder()
	    {
	        inOrderRec(root);
	    }
	    
	    public void inOrderRec(Node root)
	    {
	        if(root!=null)
	        {
	            inOrderRec(root.left);
	            System.out.println(root.key);
	            inOrderRec(root.right);
	        }
	    }
	    
	
	 public static void main(String[] arg) 
    { 
        BinarySearchTree tree = new BinarySearchTree(); 
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        tree.inOrder(); 
    } 
}