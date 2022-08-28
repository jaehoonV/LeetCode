class Solution {
    public String removeStars(String s) {
        StringBuffer sb = new StringBuffer();

        Stack<Character> stack = new Stack<>(); //char형 스택 선언
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '*'){ // push
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        while(!stack.isEmpty()) { //append
			sb.append(stack.pop());	
		}
        // reverse 후 string으로 변환하여 반환
        return sb.reverse().toString();  
    }
}