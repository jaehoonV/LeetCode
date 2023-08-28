class MyStack {
    
    ArrayList<Integer> stack_list;
    
    public MyStack() {
        stack_list = new ArrayList<>();
    }
    
    public void push(int x) {
        stack_list.add(x);
    }
    
    public int pop() {
        int s = stack_list.size();
        int output = stack_list.get(s - 1);
        stack_list.remove(s - 1);
        
        return output;
    }
    
    public int top() {
        int s = stack_list.size();
        return stack_list.get(s - 1);
    }
    
    public boolean empty() {
        return stack_list.size() == 0 ? true : false;
    }
}
