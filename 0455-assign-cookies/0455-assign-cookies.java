class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int output = 0;
        int i = 0;
        for(int n : g){
            if(s.length <= i) break;
            while(i < s.length){
                if(n <= s[i]){
                    output++;
                    i++;
                    break;
                }
                i++;
            }
            
        }
        return output;
    }
}