public class StackOfPlates{
	int threshold;
	int top;
	int[][] arr;
	int i;
	public StackOfPlates(int t)
	{
		threshold = t;
		top = -1;
		arr = new int[3][threshold];
		i = 0;
	}
	
	public void push(int item)
	{
		
		if(top<threshold-1)
		{
		    if(i>=3)
		    {
		        return;
		    }
		    
    		arr[i][++top] = item;
    		System.out.println(i+" "+ top+"->"+item);
    		
		}
		else
		{
		    i++;
		    top = -1;
		    if(i>=3)
		    {
		        return;
		    }
		    
    		arr[i][++top] = item;
    		System.out.println(i+" "+ top+"->"+item);
		}
	}
	public int pop()
	{
	    if(i<0)
	     return -1;
	   // System.out.println("POP"+i+" "+top);
	    int out = arr[i][top];
	   // System.out.println(out);
	    top--;
	    if(top<0)
	    {
	        top = threshold-1;
	        i-=1;
	    }
		return out;
		
	}
	
	public static void main(String[] args)
	{
		StackOfPlates sp = new StackOfPlates(2);
		sp.push(1);
		sp.push(2);
		sp.push(3);
		sp.push(4);
		sp.push(5);
		int temp = sp.pop();
		System.out.println("POP:"+temp);
		temp = sp.pop();
		System.out.println("POP:"+temp);
		temp = sp.pop();
		System.out.println("POP:"+temp);
		temp = sp.pop();
		System.out.println("POP:"+temp);
		temp = sp.pop();
		System.out.println("POP:"+temp);
		temp = sp.pop();
		System.out.println("POP:"+temp);
		
	}
}