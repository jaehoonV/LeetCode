class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> output = new ArrayList<>();
        int[] count = new int[26], temp;
        int i = 0;

        for (String b : words2) {
            temp = counter(b);
            for (i = 0; i < 26; i++) count[i] = Math.max(count[i], temp[i]);
        }
        
        for (String a : words1) {
            temp = counter(a);
            for (i = 0; i < 26; i++) if (temp[i] < count[i]) break;
            if (i == 26) output.add(a);
        }

        return output;
    }

    public int[] counter(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) count[c - 'a']++;
        return count;
    }
}