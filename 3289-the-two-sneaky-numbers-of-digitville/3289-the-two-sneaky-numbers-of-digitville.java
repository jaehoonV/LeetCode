class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] chk = new int[100];
        
        for(int n : nums){
            if(chk[n] > 0) list.add(n);
            else chk[n] = 1;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}