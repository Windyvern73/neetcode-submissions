class MinStack {
    long min;
    Stack<Long> e_values;
    public MinStack() {
        min = Integer.MAX_VALUE;
        e_values = new Stack<>();
    }
    
    public void push(int val) {
        e_values.push(val - min);
        if(val < min) {
            min = val;
        }
    }
    
    public void pop() {
        if(e_values.isEmpty()) {
            return;
        }
        long v = e_values.pop();
        if(v < 0) {
            min = min - v;
        }
    }
    
    public int top() {
        if(e_values.peek() < 0) {
            return (int) min;
        }
        else {
            return (int) (min + e_values.peek());
        }
    }
    
    public int getMin() {
        return (int) min;
    }
}
