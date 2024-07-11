class Solution {
    public String reverseParentheses(String s) {
        Deque<String> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push("(");
            } else if (c == ')') {
                StringBuilder temp = new StringBuilder();
				
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    temp.append(new StringBuilder(stack.pop()).reverse());
                }
				
                stack.pop();
                stack.push(temp.toString());
            } else {
                stack.push(String.valueOf(c));
            }
        }
        
        StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            output.insert(0, stack.pop());
        }
        
        return output.toString();
    }
}