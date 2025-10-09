class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;

        long[] output = new long[n];
        
        for(int i = 0; i < m; i++) {
            long x = mana[i];
            long curr = output[0]; 
            
            for(int j = 1; j < n; j++){
                curr = Math.max(curr + (long) skill[j - 1] * x, output[j]);
            }
            
            output[n - 1] = curr + (long) skill[n - 1] * x;
            
            for(int j = n - 2; j >= 0; j--){
                output[j] = output[j + 1] - (long) skill[j + 1] * x;
            }
        }
        
        return output[n - 1];
    }
}