class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt1[] = new int[26];
        int cnt2[] = new int[26];
        int output = 0;
        
        for(char c: word.toCharArray()){
            if(c >= 'a' && c <= 'z') cnt1[c - 'a']++;
            else cnt2[c - 'A']++;
        }
        
        for(int i = 0; i < 26; i++){
            if(cnt1[i]!=0 && cnt2[i]!=0) output++;
        }
        return output;
    }
}