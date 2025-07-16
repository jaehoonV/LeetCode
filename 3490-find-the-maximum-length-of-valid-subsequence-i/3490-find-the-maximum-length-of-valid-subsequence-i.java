class Solution {
    public int maximumLength(int[] nums) {
        int ce = 0, co = 0, ed = 0, od = 0;
        for(int n : nums) {
            if(n % 2 == 0) {
                ce++;
                ed = Math.max(ed, od + 1);
            }else{
                co++;
                od = Math.max(od, ed + 1);
            }
        }

        return Math.max(Math.max(ce, co), Math.max(ed, od));
    }
}