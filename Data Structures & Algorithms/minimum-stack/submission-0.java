class MinStack {
        Stack<Integer> minStack;

    public MinStack() {
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        minStack.push(val);
    }
    
    public void pop() {
        minStack.pop();
    }
    
    public int top() {
       return minStack.peek();
        
    }
    
    public int getMin() { 
        int min = minStack.get(0);
       
        for (int i=1; i< minStack.size();i++){
            if(minStack.get(i) < min){
                min=minStack.get(i);
            }
        }


       return min;
    }
}
