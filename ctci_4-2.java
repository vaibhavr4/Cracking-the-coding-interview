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
	    
	    public void insert(int[] arr)
	    {
	        root = insertRec(arr,0,arr.length-1);
	    }
	    
	    public Node insertRec(int[] arr, int start, int end)
	    {
	        if(end<start)
	            return null;
	        int mid = (start+end)/2;
	        root = new Node(arr[mid]);
	        
	        root.left = insertRec(arr,start, mid-1);
	       
	        root.right = insertRec(arr,mid+1,end);
	        
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
	    
	    public void preOrder()
	    {
	        preOrderRec(root);
	    }
	    
	   public void preOrderRec(Node root)
	   {
	       if(root!=null)
	       {
	        System.out.println(root.key);
	        preOrderRec(root.left);
	        preOrderRec(root.right);
	       }
	   }
	    
	
	 public static void main(String[] arg) 
    { 
        BinarySearchTree tree = new BinarySearchTree(); 
        int[] arr = new int[]{20,30,40,50,60,70};
        tree.insert(arr); 
            
        tree.inOrder(); 
    } 
}