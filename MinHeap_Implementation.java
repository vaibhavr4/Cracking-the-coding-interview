public class MinHeap
{
	int[] Heap;
	int maxSize;
	int size;
	
	static final int FRONT = 1;
	
	public MinHeap(int maxSize)
	{
		this.maxSize = maxSize;
		size = 0;
		Heap = new int[maxSize+1];
		Heap[0] = Integer.MIN_VALUE;
	}
	
	public int parent(int pos)
	{
		return pos/2;
	}
	
	public int left_child(int pos)
	{
		return (2* pos);
	}
	
	public int right_child(int pos)
	{
		return (2*pos)+1;
	}
	
	public boolean isLeaf(int pos)
	{
		return (pos>=(size/2) && pos<=size);
	}
	
	public void swap(int fpos, int rpos)
	{
		int temp = Heap[fpos];
		Heap[fpos] = Heap[rpos];
		Heap[rpos] = temp;
	}
	
	public void minHeapify(int pos)
	{
		if(!isLeaf(pos))
		{
			if(Heap[pos]>Heap[left_child(pos)] || Heap[pos]>Heap[right_child(pos)])
			{
				if(Heap[left_child(pos)]<Heap[right_child(pos)])
				{
					swap(pos,left_child(pos));
					minHeapify(left_child(pos));
				}
				else
				{
					swap(pos,right_child(pos));
					minHeapify(right_child(pos));
				}
			}
		}
	}
	
	public void insert(int element)
	{
		Heap[++size] = element;
		int current = size;
		while(Heap[current]<Heap[parent(current)])
		{
			swap(current,parent(current));
			current = parent(current);
		}
	}
	
	public void minHeap()
	{
		for(int pos = (size/2); pos>=1;pos--)
			minHeapify(pos);
	}
	
	public int removeMin()
	{
		int out = Heap[FRONT];
		Heap[FRONT] = Heap[size--];
		minHeapify(FRONT);
		return out;
	}
	
	public void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + Heap[i] 
                     + " LEFT CHILD : " + Heap[2 * i] 
                   + " RIGHT CHILD :" + Heap[2 * i + 1]); 
            System.out.println(); 
        } 
    } 
	
	 public static void main(String[] arg) 
    { 
        System.out.println("The Min Heap is "); 
        MinHeap minHeap = new MinHeap(15); 
        minHeap.insert(5); 
        minHeap.insert(3); 
        minHeap.insert(17); 
        minHeap.insert(10); 
        minHeap.insert(84); 
        minHeap.insert(19); 
        minHeap.insert(6); 
        minHeap.insert(22); 
        minHeap.insert(9); 
        minHeap.minHeap(); 
  
        minHeap.print(); 
        System.out.println("The Min val is " + minHeap.removeMin()); 
    } 
}