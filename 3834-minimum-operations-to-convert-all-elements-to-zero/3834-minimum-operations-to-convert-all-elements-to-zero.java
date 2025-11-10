class Solution {
    public int minOperations(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int output = 0;

        for(int n : nums){
            while(!list.isEmpty() && list.get(list.size() - 1) > n) {
                list.remove(list.size()-1);
            }

            if(n == 0) continue;
            if(list.isEmpty() || list.get(list.size() - 1) < n) {
                list.add(n);
                output++;
            }
        }
        return output;
    }
}