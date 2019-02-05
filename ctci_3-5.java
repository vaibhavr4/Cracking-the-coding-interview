import java.util.*; 
public class StackSort
{
    public void sort(Stack<Integer> s)
    {
        Stack<Integer> r = new Stack<>();
        while(!s.isEmpty())
        {
            int temp = s.pop();
            while(!r.isEmpty() && r.peek() > temp)
            {
                s.push(r.pop());
            }
            r.push(temp);
        }
        while(!r.isEmpty())
            s.push(r.pop());
            
        
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(1);
        s.push(6);
        s.push(4);
        s.push(5);
        StackSort t = new StackSort();
        t.sort(s);
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
    
}