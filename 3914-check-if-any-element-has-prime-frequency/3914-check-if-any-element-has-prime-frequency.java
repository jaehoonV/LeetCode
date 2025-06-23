class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> temp = new HashMap<>();

        for(int i : nums){
            temp.put(i, temp.getOrDefault(i, 0) + 1);
        }

        for(int v : temp.values()){
            if(v == 2 || v == 3 || v == 5 || v == 7) {
                return true;
            }
            if(v == 1 || v % 2 == 0 || v % 3 == 0 || v % 5 == 0 || v % 7 == 0) {
                continue;
            }
            return true;
        }

        return false;
    }
}