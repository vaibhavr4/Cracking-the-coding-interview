public class StackOfPlates
{
    public List<Stack<Integer>> sp = new ArrayList<Stack<>>();
    int capacity;
    public StackOfPlates(int capacity)
    {
        this.capacity = capacity;
    }
    public Stack getLastStack()
    {
        if(sp.size()==0) return null;
        return sp.get(sp.size()-1);
    }
    public void push(int item)
    {
        Stack last = getLastStack();
        if(last != null && !last.isFull())
            last.push(item);
        else
        {
            Stack stack = new Stack(capacity);
            stack.push(item);
            sp.add(stack);
        }
         
    }
    
    public int pop()
    {
        Stack last = getLastStack();
        if(last==null) throw new EmptyStackException;
        int v = last.pop();
        if(last.size==0) sp.remove(stacks.size()-1);
        return v;
    }
    
    
}