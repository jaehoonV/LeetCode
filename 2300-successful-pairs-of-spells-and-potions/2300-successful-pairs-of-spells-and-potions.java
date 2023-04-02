class Solution {
    public int[] successfulPairs(int[] s, int[] p, long success) {
        int n = s.length;
        int m = p.length;
        
        Arrays.sort(p);
        
        int[] output = new int[n];
        
        for(int i = 0; i < n; i++){
            int l = 0, h = m;
            while(l < h){
                int mid = (l + h) / 2;
                if(1L * s[i] * p[mid] >= success){
                    h = mid;
                } else{
                    l = mid + 1;
                }
            }
            output[i] = m - l;
        }
        return output;
    }
}