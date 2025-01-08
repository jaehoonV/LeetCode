class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int output = 0, n = words.length;
        for(int i = 0; i < n - 1; i++){
            String str = words[i];
            int len = str.length();
            for(int j = i + 1; j < n; j++){
                String str2 = words[j];
                int len2 = str2.length();

                if(len <= len2 &&str2.substring(0, len).equals(str) && str2.substring(len2 - len).equals(str)) output++;
            }
        }
        return output;
    }
}