class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int f : friends) set.add(f);
        
        List<Integer> output = new ArrayList<>();
        for(int o : order){
            if(set.contains(o)) output.add(o);
        }
            
        return output.stream().mapToInt(Integer::intValue).toArray();
    }
}