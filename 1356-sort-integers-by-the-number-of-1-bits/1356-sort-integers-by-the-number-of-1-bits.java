class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        int n = arr.length;
        int output[] = new int[n];
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int temp = Integer.bitCount(num);
            if (map.containsKey(temp)) {
                map.get(temp).add(num);
            } else {
                map.put(temp, new ArrayList(Arrays.asList(num)));
            }
        }
        
        int t = 0;
        for (Map.Entry<Integer, ArrayList<Integer>> mp : map.entrySet()) {
            Collections.sort(mp.getValue());
            for (int a : mp.getValue()) {
                output[t++] = a;
            }
        }
        return output;
    }
}