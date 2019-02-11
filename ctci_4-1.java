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
	    LinkedList<Integer> q = new LinkedList<Integer>();
	    
	    boolean[] visited = new boolean[V];
	    visited[s] = true;
	    Iterator<Integer> i; 
	    q.add(s);
	    while(!q.isEmpty())
	    {
	        int n = q.poll();
	        i = adj[n].listIterator();
	        while(i.hasNext())
	        {
    	        int x = i.next();
    	        System.out.println(x);
    	        if(x==d)
    	            return true;
    	        visited[x] = true;
    	        q.add(x);
	        }

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
        
        System.out.println(isPath(2,1));
    } 
}
