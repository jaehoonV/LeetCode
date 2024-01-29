class MyQueue {
    ArrayList<Integer> arr;
    public MyQueue() {
        arr = new ArrayList<>();
    }
    
    public void push(int x) {
        arr.add(x);
    }
    
    public int pop() {
        int output = arr.get(0);
        arr.remove(0);
        return output;
    }
    
    public int peek() {
        return arr.get(0);
    }
    
    public boolean empty() {
        return arr.size() == 0 ? true : false;
    }
}