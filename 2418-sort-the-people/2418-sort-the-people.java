class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        int leng = h.length;
        HashMap<Integer, String> hm = new HashMap<>();
        String[] s = new String[leng];
        for(int i = 0; i < leng; i++){
            hm.put(h[i], n[i]);
        }
        
        Arrays.sort(h);
        int i = 0;
        for(int j = leng - 1; j >= 0; j--) {
            s[i++] = hm.get(h[j]);
        }
        return s;
    }
}