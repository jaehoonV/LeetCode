class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        List<Integer> list = new ArrayList<>(set);
        
        Collections.sort(list, Collections.reverseOrder());
        
        int[] output = new int[Math.min(k, list.size())];
        for (int i = 0; i < output.length; i++) {
            output[i] = list.get(i);
        }
        return output;
    }
}