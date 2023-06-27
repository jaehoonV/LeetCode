class Solution {
    public int maxDepth(String s) {
        int cnt = 0, output = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') cnt++;
            output = Math.max(output,cnt);
            if(s.charAt(i)==')') cnt--;
        }
        return output;
    }
}