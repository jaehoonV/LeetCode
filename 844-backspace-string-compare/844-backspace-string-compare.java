class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<String> stack_s = new Stack<>(); 
        Stack<String> stack_t = new Stack<>();
        
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        
        stack_s = make_stack(s_arr);
        stack_t = make_stack(t_arr);
//        for(String str: stack_s) System.out.print(str + " ");
//        System.out.println();
//        for(String str: stack_t) System.out.print(str + " ");
        
        if(stack_s.size() != stack_t.size()) { // 길이가 다른경우 false 반환
        	return false;
        }
        
        while(stack_s.size() !=0 && stack_t.size() !=0){ // size가 0이 될 때까지 반복
            
        	if(stack_s.peek().equals(stack_t.peek())){ // peek값이 같을 경우 pop, 같지 않을 경우 false반환
            	stack_s.pop();
                stack_t.pop();
            } else {
            	return false;
            }
        }
        return true;
    }
	
	// char[] stack으로 변환
	private static Stack<String> make_stack(char[] arr) {
		Stack<String> stack = new Stack<>();
		for(char c : arr){
            if(c == '#'){ // #일 경우 pop
            	if(stack.size() != 0) {
            		stack.pop();
            	}
            } else {
                stack.push(Character.toString(c));
            }
        }
		return stack;
	}
}