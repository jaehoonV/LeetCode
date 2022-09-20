class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        if (m == 0 || n == 0) {
            return 0;
        }
        
        Set<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < m; i++){
            int temp = i;
            for (int j = 0; j < n; j++){
                int output = 0;
                for(int t = j; t < n; t++){
                    if(nums1[temp] == nums2[t]){
                        output++;
                        temp++;
                        if(temp == m) break;
                    }else{
                        hs.add(output);
                        break;
                    }
                }
                temp = i;
                hs.add(output);
            }
        }
        return Collections.max(hs); 
    }
}