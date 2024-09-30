class CustomStack {
    List<Integer> stack;
    int max_size = 1;
    
    public CustomStack(int maxSize) {
        stack = new ArrayList<>();
        max_size = maxSize;
    }
    
    public void push(int x) {
        if(stack.size() < max_size) stack.add(x);
    }
    
    public int pop() {
        int i = stack.size() - 1;
        if(i >= 0) {
            int output = stack.get(i);
            stack.remove(i);
            return output;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < k; i++){
            if(i < stack.size()) stack.set(i, stack.get(i) + val);
            else break;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */