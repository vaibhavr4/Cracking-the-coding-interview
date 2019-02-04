/* K stacks using single array */
public class StackArray{
	public static class KStack
	{
		int k, n;
		public int[] arr;
		public int[] top;
		public[] int next;
		public KStack(int k1, int n1)
		{
			k = k1;
			n = n1;
			arr = new int[n];
			top = new int[k];
			next = new int[n];
		}
		
		
		int free = 0;
		
		for(int i=0;i<n-1;i++)
		{
			next[i] = i+1;
		}
		next[n-1] = -1     // represent end of array
		
		for(int i=0;i<k;i++)
			top[i] = -1;
		
		boolean isFull()  
        { 
            return (free == -1); 
        }
		boolean isEmpty(int sn)  
        { 
            return (top[sn] == -1); 
        } 
		
		public int push(int sn, int item)
		{
			if (isFull())  
            { 
                System.out.println("Stack Overflow"); 
                return; 
            } 
			
			int i = free;
			free = next[i];
			next[i] = top[sn];
			top[sn] = i;
			arr[i] = item;
		}
		
		public int pop(int sn)
		{
			if (isEmpty(sn))  
            { 
                System.out.println("Stack Underflow"); 
                return Integer.MAX_VALUE; 
            }
			int i = top[sn];
			top[sn] = next[i];
			next[i] = free;
			free = i;
			
			return arr[i];
		}
	}
}