class Solution {
    public int beautifulSubstrings(String s, int k) {
        int n = s.length();
        int output = 0;
        char[] c_arr = {'a', 'e', 'i', 'o', 'u'};
        Set<Character> set = new HashSet<>();
        
        for (char c : c_arr){
            set.add(c);
        }

        for (int i = 0; i < n; i++) {
            int temp1 = 0, temp2 = 0;
            for (int j = i; j < n; j++) {
                if (set.contains(s.charAt(j)))temp2++;
                else temp1++;

                if (temp1 == temp2 && (temp1 * temp2) % k == 0) output++;
            }
        }
        return output;
    }
}