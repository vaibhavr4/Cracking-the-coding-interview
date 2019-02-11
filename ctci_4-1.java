import java.util.*;

public class FindPath
{
	public static List<Integer> adj[];
	public static int V;
	
	public FindPath(int v)
	{
	    V = v;
	    adj = new LinkedList[v];
	    for(int i=0;i<v;i++)
	        adj[i] = new LinkedList();
	}
	
	public void addEdge(int v, int w)
	{
	    adj[v].add(w);
	}
	public static boolean isPath(int s, int d)
	{
	    boolean[] visited = new boolean[V];
	    visited[s] = true;
	    Iterator<Integer> i = adj[s].listIterator();
	    while(i.hasNext())
	    {
	        int n = i.next();
	        System.out.println(n);
	        if(n==d)
	            return true;
	    }
	    return false;
	    
	}
	 public static void main(String[] arg) 
    { 
        FindPath g = new FindPath(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        System.out.println(isPath(2,3));
    } 
}