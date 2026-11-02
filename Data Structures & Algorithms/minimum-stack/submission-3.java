class MinStack {
    int min;
    Stack<Integer> values;
    Stack<Integer> mins;
    public MinStack() {
        min = Integer.MAX_VALUE;
        mins = new Stack<>();
        values = new Stack<>();
    }
    
    public void push(int val) {
        values.push(val);
        if(val < min ) {
            min = val;
        }
        mins.push(min);
    }
    
    public void pop() {
        if(values.isEmpty()) {
            return;
        }
        values.pop();
        mins.pop();
        if(mins.isEmpty()) {
            min = Integer.MAX_VALUE;
        }
        else {
            min = mins.peek();
        }
    }
    
    public int top() {
        return values.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
