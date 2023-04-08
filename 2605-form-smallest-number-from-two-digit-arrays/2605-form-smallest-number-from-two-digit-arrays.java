class Solution {
    public int minNumber(int[] n1, int[] n2) {
        Arrays.sort(n1);
        Arrays.sort(n2);
        
        int output = n1[0] < n2[0] ? n1[0] * 10 + n2[0] : n2[0] * 10+ n1[0];
        
        for(int i = 0; i < n1.length; i++){
            if(Arrays.binarySearch(n2, n1[i]) >= 0 && n1[i] < output) return n1[i];
        }
        return output;
    }
}