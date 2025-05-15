class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> output = new ArrayList<>();
        int a = -1;
        for(int i = 0; i < groups.length; i++) {
            if (groups[i] != a) {
                a = groups[i];
                output.add(words[i]);
            }
        }
        return output;
    }
}