class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long n1 = 0, n2 = 0, output = 0;
        int cnt1 = 0, cnt2 = 0;
        
        for(int n : nums1){
            if(n != 0) n1 += n;
            else cnt1++;
        }
        
        for(int n : nums2){
            if(n != 0) n2 += n;
            else cnt2++;
        }
        if(n1 < n2){
            if(cnt1 == 0) return -1;
            if(cnt1 + n1 <= cnt2 + n2){
                if(cnt1 == 0) return -1;
                else output = cnt2 + n2;
            } else{
                if(cnt2 == 0) return -1;
                else output = cnt1 + n1;
            }
        } else if(n1 > n2){
            if(cnt2 == 0) return -1;
            if(cnt1 + n1 <= cnt2 + n2){
                if(cnt1 == 0) return -1;
                else output = cnt2 + n2;
            } else{
                if(cnt2 == 0) return -1;
                else output = cnt1 + n1;
            }
        } else{
            if(cnt1 + cnt2 != 0 && (cnt1 == 0 || cnt2 == 0)) return -1;
            output = n1 + Math.max(cnt1, cnt2);    
        }
        
        return output;
    }
}