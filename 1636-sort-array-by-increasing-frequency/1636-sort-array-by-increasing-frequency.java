class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length, t = 0;
        int[] output = new int[len];
        
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, (a, b) -> {
             if(map.get(a) == map.get(b)) return b - a;
             else return map.get(a) - map.get(b);
        });
        
        for(int l : list){
            for(int i = 0; i < map.get(l); i++){
                output[t++] = l;
            }
        }

        return output;
    }
}