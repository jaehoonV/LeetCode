class Solution {
    public int minSteps(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        int [] arr = new int[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s_arr[i] - 'a']++;
            arr[t_arr[i] - 'a']--;
        }

        for (int n : arr) if (n > 0 ) count += n;

        return count;
    }
}