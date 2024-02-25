class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n, hm.getOrDefault(n, 0) + 1);
            if(hm.get(n) > 2) return false;
        }
        return true;
    }
}