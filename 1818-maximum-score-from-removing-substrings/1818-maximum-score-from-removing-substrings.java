class Solution {
    public int maximumGain(String s, int x, int y) {
        boolean b = true, highScore_bool = x > y;
		int output = 0;
		
		while(b) {
			int s_temp_leng = s.length();
			
			s = func(s, highScore_bool);
			int leng1 = s.length();
			int score = (s_temp_leng - leng1) / 2;
			
			if(highScore_bool) score *= x;
			else score *= y;
			
			output += score;
			
			if(score == 0){
				s = func(s, !highScore_bool);
				int leng2 = s.length();
				int score2 = (s_temp_leng - leng2) / 2;
			
				if(highScore_bool) score2 *= y;
				else score2 *= x;
				
				output += score2;
			}
			
			b = s.contains("ab") || s.contains("ba");
		}
		
		return output;
    }
	
	public String func(String s, boolean b){
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()){
			if(b){
				if(!stack.isEmpty() && stack.peek() == 'a' && c == 'b'){
					stack.pop();
				}else{
					stack.push(c);
				}
			}else{
				if(!stack.isEmpty() && stack.peek() == 'b' && c == 'a'){
					stack.pop();
				}else{
					stack.push(c);
				}
			}
		}
		
		StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
		
        return output.reverse().toString();
		
	}
}