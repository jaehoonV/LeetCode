class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] p_arr = new int[26];
        for(int i = 0; i < p.length(); i++){
            p_arr[p.charAt(i) - 'a']++;
        }
        ArrayList<Integer> output = new ArrayList<>();

        loop1:
        for(int i = 0; i < s.length(); i++){
            int[] temp = p_arr.clone();
            int cnt = 1;
            loop2:
            for(int j = i; j < s.length(); j++){
                if(temp[s.charAt(j) - 'a']-- == 0) continue loop1;
                
                if(cnt++ >= p.length()) break loop2;
            }
            if(Arrays.stream(temp).sum() == 0)  output.add(i);
        }
        return output;
    }
}