class Solution {
    public int minSwaps(String s) {
        int output = 0, last = s.length() - 1;
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == '['){
				stack.push('[');
			}else{
				if(stack.size() > 0 && stack.peek() == '['){
					stack.pop();
				}else{
					for(int j = last; j >= 0; j--){
						if(arr[j] == '['){
							arr[j] = ']';
							stack.push('[');
							last = j;
							output++;
							break;
						}
					}
				}
			}
		}
		
		return output;
    }
}