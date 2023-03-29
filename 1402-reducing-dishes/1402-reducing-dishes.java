class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        
        int n = s.length;
        
        int temp = 0, output = 0;
        for (int i = n - 1; i >= 0; i--) {
            temp += s[i];
            if(temp <= 0) break;
            output += temp;
        }
        return output;
    }
}