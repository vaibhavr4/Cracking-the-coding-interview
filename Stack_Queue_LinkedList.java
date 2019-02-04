/* Stack using LinkedList */
public class MyStack<T>{
	public static class StackNode<T>{
		T data;
		StackNode<T> next;
		public StackNode(T item)
		{
			data = item;
		}
	}
	public StackNode<T> top;
	
	public T pop()
	{
		if(top==null) return EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
		
	}
	public push(T item)
	{
		StackNode<T> node = new StackNode<T>(item);
		node.next = top;
		top = node;
		
	}
	public T peek()
	{
		if(top==null) return EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
}


/* Queue using LinkedList */

public class MyQueue<T>{
	public static class QueueNode<T>{
		T data;
		QueueNode<T> next;
		public QueueNode(T item)
		{
			data = item;
		}
	}
	public QueueNode<T> first;
	public QueueNode<T> last;
	
	public T remove()
	{
		if(first == null) return NoSuchElementException();
		T item = first.data;
		first = first.next;
		if(first == null)
			last = null;
		return item;
	}
	
	public add(T item)
	{
		QueueNode<T> node = new QueueNode<T>(item);
		if(last!=null)
			last.next = node;
		last = node;
		if(first == null)
			first = node;
	}
	public T peek(){
		if(first == null) return NoSuchElementException();
		return first.data;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
}