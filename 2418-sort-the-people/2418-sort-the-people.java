class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        int leng = h.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        String[] s = new String[leng];
        for(int i = 0; i < leng; i++){
            hm.put(h[i], i);
        }
        
        Object[] mapKey = hm.keySet().toArray();
        Arrays.sort(mapKey);
        
        int j = leng - 1;
        for(Object keyVal : mapKey) {
            s[j--] = n[hm.get(keyVal)];
        }
        return s;
    }
}