class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        
        for(int num : nums){
            int v = num;
            
            while(!stack.isEmpty() && v < stack.peek()){
                v = Math.max(v, stack.pop());
            }
            stack.push(v);
        }
        
        return stack.size();
    }
}