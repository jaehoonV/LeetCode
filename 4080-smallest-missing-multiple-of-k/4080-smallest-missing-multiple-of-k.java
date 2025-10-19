class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            if(n % k == 0) set.add(n);
        }

        int i = 1;
        while(true){
            int t = i * k;
            if(!set.contains(t)) return t;
            i++;
        }
    }
}