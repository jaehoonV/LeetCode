class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.empty() && t[stack.peek()] < t[i]) {
                int a = stack.pop();
                output[a] = i - a;
            }
            stack.push(i);
        }
        return output;
    }
}
