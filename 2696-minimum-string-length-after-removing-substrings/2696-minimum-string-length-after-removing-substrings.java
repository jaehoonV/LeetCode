class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (c == 'B' && stack.peek() == 'A') stack.pop();
            else if (c == 'D' && stack.peek() == 'C') stack.pop();
            else stack.push(c);
        }

        return stack.size();
    }
}