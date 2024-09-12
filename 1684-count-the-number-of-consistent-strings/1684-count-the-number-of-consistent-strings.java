class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] al = new boolean[26];
        int output = 0;
        
        for(char a : allowed.toCharArray()) al[a - 'a'] = true;
        
        for(String w : words){
            int n = w.length();
            boolean b = true;
            for(int i = 0; i < n; i++){
                if(!al[w.charAt(i) - 'a']) {
                    b = false;
                    break;
                }
            }
            if(b) output++;
        }
        return output;
    }
}
