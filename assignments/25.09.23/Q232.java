import java.util.Stack;

public class Q232 {
    class MyQueue {
    Stack<Integer> q;
    Stack<Integer> w;

    public MyQueue() {
        q = new Stack<>();
        w = new Stack<>();
    }
    
    public void push(int x) {
        while(!q.isEmpty()) w.push(q.pop());
        w.push(x);
    }
    
    public int pop() {
        while(!w.isEmpty()){
            q.push(w.pop());
        }

        return q.pop();
    }
    
    public int peek() {
        while(!w.isEmpty()){
            q.push(w.pop());
        }

        return q.peek();
    }
    
    public boolean empty() {
        if(q.isEmpty() && w.isEmpty()) return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
