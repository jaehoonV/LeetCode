class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int m = words.length;
        int[] words_int = new int[m];
        words_int[0] = func(words[0]);

        for(int i = 1; i < m; i++){
            words_int[i] = words_int[i - 1] + func(words[i]);
        }
        
        int[] output = new int[n];
        for(int i = 0; i < n; i++){
            int q_0 = queries[i][0];
            int q_1 = queries[i][1];
            output[i] = q_0 == 0 ? words_int[q_1] : words_int[q_1] - words_int[q_0 - 1];
        }
        return output;
    }
    
    public int func(String word){
        if(func1(word.charAt(0)) && func1(word.charAt(word.length() - 1))) return 1;
        return 0;
    }
    
    public boolean func1(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') return true;
        return false;
    }
}