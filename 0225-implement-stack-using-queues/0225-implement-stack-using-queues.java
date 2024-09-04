class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i = 0; i<q.size()-1;i++)
        {
            q.add(q.poll());
        }
    }
    
    public int pop() {
        int t = q.poll();
        return t;
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.isEmpty())
        return true;
        return false;
    }
}

