class MinStack {

    /** initialize your data structure here. */
   Stack<Integer> orig = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(orig.isEmpty() == true)
        {
            orig.push(x);
            min.push(x);
        }
        else
        {
            orig.push(x);
            int temp = min.pop();
            min.push(temp);
            if(x<temp)
                min.push(x);
            else
                min.push(temp);
        }
    }
    
    public void pop() {
        orig.pop();
        min.pop();
    }
    
    public int top() {
        return orig.peek();
    }
    
    public int getMin() {
        int x = min.pop();
        min.push(x);
        return x;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */