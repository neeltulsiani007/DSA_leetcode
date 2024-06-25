class MyStack {

Queue<Integer> q1;
Queue<Integer> q2 ;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    
    public int pop() {

        if(q2.isEmpty())
        return -1;
        int t = q2.peek();
        q2.remove();
        return t;

    }
    
    public int top() {

        if(q2.isEmpty())
        return -1;
        int t = q2.peek();
        return t;
    }
    
    public boolean empty() {
        if(q2.isEmpty())
        return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */