class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> output = new ArrayList<>();
        int t = 0;
        for(int n : nums) {
            t = ((t * 2) + n) % 5;
            output.add(t == 0);
        }
        return output;
    }
}