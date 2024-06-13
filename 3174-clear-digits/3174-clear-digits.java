class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
		StringBuilder output = new StringBuilder();
		for(char c : s.toCharArray()){
			if(Character.isDigit(c)) stack.pop();
			else stack.push(c);
		}
		
		while(stack.size() > 0){
			output.append(stack.pop());
		}
		
		return output.reverse().toString();
    }
}