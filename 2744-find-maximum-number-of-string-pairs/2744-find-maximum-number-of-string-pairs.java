class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        int output = 0;
        for(int i = 0; i < n; i++){
            StringBuffer sb = new StringBuffer(words[i]);
            String str = sb.reverse().toString();
            for(int j = i + 1; j < n; j++){
                if(str.equals(words[j])){
                    output++;
                    break;
                }
            }
        }
        return output;
    }
}