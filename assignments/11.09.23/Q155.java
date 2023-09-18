class MinStack {

    int min = Integer.MAX_VALUE;
    Stack<Integer> obj = new Stack<Integer>();
    
    
    public void push(int val) {
        if(val<=min){
            obj.push(min);
            min = val;
        }

        obj.push(val);
        
    }
    
    public void pop() {
        if(obj.pop() == min) min=obj.pop();
    }
    
    public int top() {
        return obj.peek();
    }
    
    public int getMin() {
        return min;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */