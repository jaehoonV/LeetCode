class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n : nums){
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    hs.add(i);
                    n = n / i;
                }
            }
        }
        return hs.size();
    }
}