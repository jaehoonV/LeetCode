class Solution {
    public int vowelConsonantScore(String s) {
        int cnt = 0, cnt2 = 0;
        String vowels = "aeiou";

        for(char c : s.toCharArray()){
            if (vowels.indexOf(c)!=-1){
                cnt++;
                continue;
            }
            if(Character.isAlphabetic(c)){
                cnt2++;
            }
        }
        return cnt2 == 0 ? 0 : cnt / cnt2;
    }
}