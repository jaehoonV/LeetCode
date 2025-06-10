class Solution {
    public int maxDifference(String s) {
        int[] temp = new int[26];
        int max = 0, min = s.length();
        for(char c : s.toCharArray()) {
            temp[c - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(temp[i] % 2 != 0) {
                max = Math.max(max, temp[i]);
            }

            if(temp[i] % 2 == 0 && temp[i] > 0) {
                min = Math.min(min, temp[i]);
            }
        }

        return max - min;
    }
}