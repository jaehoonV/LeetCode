class Solution {
    public int[] findArray(int[] pref) {
        int output = pref[0];
        
        for (int i = 1; i < pref.length; i++) {
            pref[i] ^= output;
            output ^= pref[i];
        }
        
        return pref; 
    }
}