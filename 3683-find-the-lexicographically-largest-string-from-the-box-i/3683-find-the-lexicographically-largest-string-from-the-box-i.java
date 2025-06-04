class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends == 1) return word;

        int n = word.length();
        int l = n - numFriends + 1;
        char maxc = 'a';

        for(char ch : word.toCharArray()) {
            if(ch > maxc) maxc = ch;
        }

        String output = "";
        for(int i = 0; i < n; i++) {
            if(word.charAt(i) == maxc) {
                if(i + l <= n) {
                    String sub = word.substring(i, i + l);
                    if (sub.compareTo(output) > 0) output = sub;
                }else{
                    String sub = word.substring(i);
                    if (sub.compareTo(output) > 0) output = sub;
                }
            }
        }

        return output;
    }
}