class Solution {
    public int maxVowels(String s, int k) {
        int cnt = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char t = s.charAt(i);
            if(t == 97 || t == 101 || t == 105 || t == 111 || t == 117){
                cnt++;
            }
            if(i >= k){
                char e = s.charAt(i - k);
                if(e == 97 || e == 101 || e == 105 || e == 111 || e == 117){
                    cnt--;
                }
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}