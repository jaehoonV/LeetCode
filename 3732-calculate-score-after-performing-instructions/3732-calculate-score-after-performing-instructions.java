class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long output = 0;
        int i = 0;
        int n = instructions.length;
        
        Set<Integer> set = new HashSet<>();
        
        while(i >= 0 && i < n && !set.contains(i)){
            set.add(i);
            String s = instructions[i];
            int v = values[i];
            if(s.equals("add")){
                output += v;
                i++;
            }else{
                i += v;
            }
        }
        
        return output;
    }
}